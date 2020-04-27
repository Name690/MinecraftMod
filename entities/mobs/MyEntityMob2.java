package mymod.entities.mobs;



import mymod.entities.projectiles.MyEntityProjectile1;
import mymod.library.entities.mobs.entities.LibEntityGenericMonster;
import mymod.library.util.Actions;
import mymod.library.util.Conditions;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class MyEntityMob2 extends LibEntityGenericMonster {

	public boolean canFlee = false;

	public MyEntityMob2(World worldIn) {
		super(worldIn);
		this.setSize(1, 1.6F);
		this.enableBossBar();

		this.ambientSound = SoundEvents.ENTITY_VILLAGER_AMBIENT;
		this.stepSound = SoundEvents.BLOCK_STONE_STEP;
		this.hurtSound = SoundEvents.ENTITY_DONKEY_HURT;
		this.deathSound = SoundEvents.ENTITY_VILLAGER_DEATH;

	}

	// Sets the Entity's attributes
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		double movementSpeed = 0.30D; // how fast it moves normally
		double attackDamage = 6D; // how many half-hearts of damage it deals
		double maxHealth = 150D; // max health

		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(movementSpeed);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attackDamage);
	}

	@Override
	public void onUpdate() {
		EntityPlayer player = Actions.getClosestPlayer(this);

		if (player != null && Conditions.secondsGoneBy(world, 3) && this.getDistanceToEntity(player) <= 5) {
			Actions.addPotionEffect(player, MobEffects.BLINDNESS, 80, 2, false);
			Actions.spawnParticleAtEntity(player, EnumParticleTypes.EXPLOSION_LARGE, 3, 3);
			Actions.chatAtPlayer(player, TextFormatting.BOLD + "POOPPY BUTT");
			/** Phase 1 **/
			if (this.getHealth() > 100) {
				// Long Range Attack
				if (this.getDistanceToEntity(player) >= 6) {
					this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Blocks.DIRT));
					Actions.launchProjectile(this, player, MyEntityProjectile1.class, 5);
				}
				// Melle Attack
				else if (this.getDistanceToEntity(player) <= 5) {
					this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.WOODEN_SWORD));
					Actions.swingArm(this);
					Actions.attackEntity(this, player);
				}

			}
			/** Phase 2 **/
			else if (this.getHealth() >= 50) {
				canFlee = true;
				this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Blocks.PLANKS));
				Actions.addPotionEffect(player, MobEffects.WITHER, 1, 0, false);
				Actions.addPotionEffect(player, MobEffects.SPEED, 5, 20, false);
				Actions.launchProjectile(this, player, MyEntityProjectile1.class, 5);
				Actions.castVindicatorFangs(this, player);
				this.setInvisible(true);
			}
			/** Phase 3 **/
			else if (this.getHealth() <= 10 && canFlee == true) {
				canFlee = false;
				this.setInvisible(false);
				Actions.teleportRandomly(this, 20);
				Actions.swingArm(this);
				Actions.swingArm(player);
				Actions.attackEntity(this, player);
				Actions.swingArm(player);
				Actions.createEntity(world, player.getPosition().up(), MyEntityProjectile1.class);
			}
		}
		if (Conditions.secondsGoneBy(world, 5))
			Actions.addHealth(this, 5);
		Actions.setBlockStates(world, player.getBedLocation(), Blocks.AIR.getDefaultState(), 1, true);
		super.onUpdate();
	}

	@Override
	public void onFirstSpawn() {
		EntityPlayer player = Actions.getClosestPlayer(this);
		Actions.addPotionEffect(player, MobEffects.NAUSEA, 5, 255, false);
		Actions.chatAtPlayer(player, TextFormatting.BOLD + "BLACKKNIGHT59 IS A POOPY BUTT");
		super.onFirstSpawn();
	}
	@Override
	public void onDeath(DamageSource cause) {
		EntityPlayer player = Actions.getClosestPlayer(this);
		Actions.createEntity(world, player.getPosition(), EntityVillager.class);
		Actions.chatAtPlayer(player, TextFormatting.BOLD + "FINE I ADMIT BLACKKNIGHT59 IS GREAT");
		if (!world.isRemote) {
			dropItem(Blocks.PLANKS, 64);
			Actions.addPotionEffect(player, MobEffects.NAUSEA, 5, 255, false);
		}
		super.onDeath(cause);
	}
	
	
	
}
