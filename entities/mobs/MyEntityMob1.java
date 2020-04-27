package mymod.entities.mobs;

import mymod.MyItems;
import mymod.library.ai.LibEntityAIDigTowardsTarget;
import mymod.library.entities.mobs.entities.LibEntityEnderman;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class MyEntityMob1 extends LibEntityEnderman {

	public MyEntityMob1(World worldIn) {
		super(worldIn);
		
		this.setSize(1.0F, 7.0F);
		
		this.hurtSound = SoundEvents.ENTITY_ELDER_GUARDIAN_HURT;
		this.ambientSound = SoundEvents.ENTITY_WITHER_SPAWN;
		this.teleportSound = SoundEvents.AMBIENT_CAVE;
		this.screamSound = SoundEvents.ENTITY_GHAST_SCREAM;
		this.stareSound = SoundEvents.ENTITY_VEX_HURT;
		
		this.lootTable = null;
		
		
		
	}
	// Sets the Entity's attributes
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        double followRange = 100.0D; // how many blocks away it will follow its target
        double maxHealth = 40.0D; // max health
        double movementSpeed = 0.5D; // how fast it moves normally
        double attackDamage = 5.0D; // how many half-hearts of damage it deals

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(movementSpeed);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(followRange);
    }
    
    // Sets the Entity's core behaviors
    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 2.0D, true));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false, new Class[0]));
        
        this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityEnderman.class, 50.0F, 0.7D, 1.0D));//Wolf
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.ENDER_PEARL, false));//Pig
        
        this.tasks.addTask(3, new LibEntityAIDigTowardsTarget(this, 10, 10, SoundEvents.BLOCK_GLASS_BREAK));//Custom
        


        }
        //when goes bye bye
    @Override
    public void onDeath(DamageSource cause) {
    	if (!this.world.isRemote) {
       	dropItem(MyItems.my_item_1, 1);
    	}
    	
    	super.onDeath(cause);
    }

    }
    


