package mymod;

import mymod.items.MyArmor1;
import mymod.items.MyArmor2;
import mymod.items.MyArmor3;
import mymod.items.MyArmor4;
import mymod.items.MyArmor5;
import mymod.items.MyArrow1;
import mymod.items.MyAxe1;
import mymod.items.MyAxe2;
import mymod.items.MyAxe3;
import mymod.items.MyAxe4;
import mymod.items.MyAxe5;
import mymod.items.MyBow1;
import mymod.items.MyHoe1;
import mymod.items.MyHoe2;
import mymod.items.MyHoe3;
import mymod.items.MyHoe4;
import mymod.items.MyHoe5;
import mymod.items.MyItem1;
import mymod.items.MyItem2;
import mymod.items.MyItem3;
import mymod.items.MyItem4;
import mymod.items.MyItem5;
import mymod.items.MyPickaxe1;
import mymod.items.MyPickaxe2;
import mymod.items.MyPickaxe3;
import mymod.items.MyPickaxe4;
import mymod.items.MyPickaxe5;
import mymod.items.MyProjectile1;
import mymod.items.MySeeds1;
import mymod.items.MyShovel1;
import mymod.items.MyShovel2;
import mymod.items.MyShovel3;
import mymod.items.MyShovel4;
import mymod.items.MyShovel5;
import mymod.items.MySword1;
import mymod.items.MySword2;
import mymod.items.MySword3;
import mymod.items.MySword4;
import mymod.items.MySword5;
import mymod.items.MySword6;
import mymod.library.LibRegistry;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.util.EnumHelper;

/**
 * DECLARE ITEMS =================================================
 */
@Mod.EventBusSubscriber
public class MyItems {

	// Astral Dust
	public static Item my_item_1;

	// Water Crystal
	public static Item my_item_2;

	// Fire Crystal
	public static Item my_item_3;

	// Sky Crystal
	public static Item my_item_4;

	// Earth Crystal
	public static Item my_item_5;

	// Astral Sword
	public static Item my_sword_1;

	// Water Sword
	public static Item my_sword_3;

	// Fire Sword
	public static Item my_sword_4;

	// Sky Sword
	public static Item my_sword_5;

	// Earth Sword
	public static Item my_sword_6;

	// Astral Staff
	public static Item my_sword_2;

	// Astral Bow
	public static Item my_bow_1;

	// Astral Arrow
	public static Item my_arrow_1;

	// Atomic Poop
	public static Item my_projectile_1;

	// Astral Armor Material
	public static ItemArmor.ArmorMaterial my_armor_material_1;

	// Element Armor Material
	public static ItemArmor.ArmorMaterial my_armor_material_2;

	// Astral Armor
	public static Item my_boots_1;
	public static Item my_leggings_1;
	public static Item my_chestplate_1;
	public static Item my_helmet_1;

	// Water Armor
	public static Item my_boots_2;
	public static Item my_leggings_2;
	public static Item my_chestplate_2;
	public static Item my_helmet_2;

	// Fire Armor
	public static Item my_boots_3;
	public static Item my_leggings_3;
	public static Item my_chestplate_3;
	public static Item my_helmet_3;

	// Air Armor
	public static Item my_boots_4;
	public static Item my_leggings_4;
	public static Item my_chestplate_4;
	public static Item my_helmet_4;

	// Earth Armor
	public static Item my_boots_5;
	public static Item my_leggings_5;
	public static Item my_chestplate_5;
	public static Item my_helmet_5;

	// Astral Rock
	public static Item my_seeds_1;

	// Astral Pickaxe
	public static Item my_pickaxe_1;

	// Astral Axe
	public static Item my_axe_1;

	// Astral Shovel
	public static Item my_shovel_1;

	// Astral Hoe
	public static Item my_hoe_1;

	// Water Axe
	public static Item my_axe_2;

	// Water Pickaxe
	public static Item my_pickaxe_2;

	// Water Shovel
	public static Item my_shovel_2;

	// Water Hoe
	public static Item my_hoe_2;

	// Fire Axe
	public static Item my_axe_3;

	// Fire Pickaxe
	public static Item my_pickaxe_3;

	// Fire Shovel
	public static Item my_shovel_3;

	// Fire Hoe
	public static Item my_hoe_3;

	// Air Axe
	public static Item my_axe_4;

	// Air Pickaxe
	public static Item my_pickaxe_4;

	// Fire Shovel
	public static Item my_shovel_4;

	// Air Hoe
	public static Item my_hoe_4;

	// Earth Axe
	public static Item my_axe_5;

	// Earth Pickaxe
	public static Item my_pickaxe_5;

	// Earth Shovel
	public static Item my_shovel_5;

	// Earth Hoe
	public static Item my_hoe_5;

	// Astral Tool Material
	public static Item.ToolMaterial my_tool_material_1;

	// Elements Tool Material
	public static Item.ToolMaterial my_tool_material_2;

	/**
	 * REGISTER ITEMS =================================================
	 */
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		// Astral Tool Material
		my_tool_material_1 = EnumHelper.addToolMaterial("my_tool_material_1", 4, 3000, 20, 10, 1);

		// Elements Tool Material
		my_tool_material_2 = EnumHelper.addToolMaterial("my_tool_material_2", 3, 500, 25, 8, 3);

		// Astral Armor Material
		my_armor_material_1 = EnumHelper.addArmorMaterial("my_armor_material_1","my_armor_material_1", 50, new int[] { 5, 9, 11, 6 }, 5,
				SoundEvents.ENTITY_WITHER_SPAWN, 4.0F);

		// Elements Armor Material
		my_armor_material_2 = EnumHelper.addArmorMaterial("my_armor_material_2","my_armor_material_2", 40, new int[] { 4, 7, 10, 5 }, 20,
				SoundEvents.BLOCK_ANVIL_FALL, 2.0F);

		// Astral Dust
		my_item_1 = new MyItem1("my_item_1");
		event.getRegistry().register(my_item_1);

		// Astral Sword
		my_sword_1 = new MySword1("my_sword_1", my_tool_material_1);
		event.getRegistry().register(my_sword_1);

		// Water Sword
		my_sword_3 = new MySword3("my_sword_3", my_tool_material_2);
		event.getRegistry().register(my_sword_3);

		// Water Sword
		my_sword_4 = new MySword4("my_sword_4", my_tool_material_2);
		event.getRegistry().register(my_sword_4);

		// Sky Sword
		my_sword_5 = new MySword5("my_sword_5", my_tool_material_2);
		event.getRegistry().register(my_sword_5);

		// Earth Sword
		my_sword_6 = new MySword6("my_sword_6", my_tool_material_2);
		event.getRegistry().register(my_sword_6);

		// Astral Bow
		my_bow_1 = new MyBow1("my_bow_1");
		event.getRegistry().register(my_bow_1);

		// Astral Arrow
		my_arrow_1 = new MyArrow1("my_arrow_1");
		event.getRegistry().register(my_arrow_1);

		// Atomic Pop
		my_projectile_1 = new MyProjectile1("my_projectile_1");
		event.getRegistry().register(my_projectile_1);

		// Astral Armor
		my_boots_1 = new MyArmor1("my_boots_1", my_armor_material_1, EntityEquipmentSlot.FEET);
		event.getRegistry().register(my_boots_1);

		my_leggings_1 = new MyArmor1("my_leggings_1", my_armor_material_1, EntityEquipmentSlot.LEGS);
		event.getRegistry().register(my_leggings_1);

		my_chestplate_1 = new MyArmor1("my_chestplate_1", my_armor_material_1, EntityEquipmentSlot.CHEST);
		event.getRegistry().register(my_chestplate_1);

		my_helmet_1 = new MyArmor1("my_helmet_1", my_armor_material_1, EntityEquipmentSlot.HEAD);
		event.getRegistry().register(my_helmet_1);

		// Water Armor
		my_boots_2 = new MyArmor2("my_boots_2", my_armor_material_2, EntityEquipmentSlot.FEET);
		event.getRegistry().register(my_boots_2);

		my_leggings_2 = new MyArmor2("my_leggings_2", my_armor_material_2, EntityEquipmentSlot.LEGS);
		event.getRegistry().register(my_leggings_2);

		my_chestplate_2 = new MyArmor2("my_chestplate_2", my_armor_material_2, EntityEquipmentSlot.CHEST);
		event.getRegistry().register(my_chestplate_2);

		my_helmet_2 = new MyArmor2("my_helmet_2", my_armor_material_2, EntityEquipmentSlot.HEAD);
		event.getRegistry().register(my_helmet_2);

		// Fire Armor
		my_boots_3 = new MyArmor3("my_boots_3", my_armor_material_2, EntityEquipmentSlot.FEET);
		event.getRegistry().register(my_boots_3);

		my_leggings_3 = new MyArmor3("my_leggings_3", my_armor_material_2, EntityEquipmentSlot.LEGS);
		event.getRegistry().register(my_leggings_3);

		my_chestplate_3 = new MyArmor3("my_chestplate_3", my_armor_material_2, EntityEquipmentSlot.CHEST);
		event.getRegistry().register(my_chestplate_3);

		my_helmet_3 = new MyArmor3("my_helmet_3", my_armor_material_2, EntityEquipmentSlot.HEAD);
		event.getRegistry().register(my_helmet_3);

		// Air Armor
		my_boots_4 = new MyArmor4("my_boots_4", my_armor_material_2, EntityEquipmentSlot.FEET);
		event.getRegistry().register(my_boots_4);

		my_leggings_4 = new MyArmor4("my_leggings_4", my_armor_material_2, EntityEquipmentSlot.LEGS);
		event.getRegistry().register(my_leggings_4);

		my_chestplate_4 = new MyArmor4("my_chestplate_4", my_armor_material_2, EntityEquipmentSlot.CHEST);
		event.getRegistry().register(my_chestplate_4);

		my_helmet_4 = new MyArmor4("my_helmet_4", my_armor_material_2, EntityEquipmentSlot.HEAD);
		event.getRegistry().register(my_helmet_4);

		// Earth Armor
		my_boots_5 = new MyArmor5("my_boots_5", my_armor_material_2, EntityEquipmentSlot.FEET);
		event.getRegistry().register(my_boots_5);

		my_leggings_5 = new MyArmor5("my_leggings_5", my_armor_material_2, EntityEquipmentSlot.LEGS);
		event.getRegistry().register(my_leggings_5);

		my_chestplate_5 = new MyArmor5("my_chestplate_5", my_armor_material_2, EntityEquipmentSlot.CHEST);
		event.getRegistry().register(my_chestplate_5);

		my_helmet_5 = new MyArmor5("my_helmet_5", my_armor_material_2, EntityEquipmentSlot.HEAD);
		event.getRegistry().register(my_helmet_5);

		// Astral Rock
		my_seeds_1 = new MySeeds1("my_seeds_1", MyBlocks.my_crop_1);
		event.getRegistry().register(my_seeds_1);

		// Astral Pickaxe
		my_pickaxe_1 = new MyPickaxe1("my_pickaxe_1", 2, 2, my_tool_material_1);
		event.getRegistry().register(my_pickaxe_1);

		// Astral Axe
		my_axe_1 = new MyAxe1("my_axe_1", 1.3F, 0, my_tool_material_1);
		event.getRegistry().register(my_axe_1);

		// Astral Shovel
		my_shovel_1 = new MyShovel1("my_shovel_1", 2, 2, my_tool_material_1);
		event.getRegistry().register(my_shovel_1);

		// Astral Hoe
		my_hoe_1 = new MyHoe1("my_hoe_1", 2, 2F, my_tool_material_1);
		event.getRegistry().register(my_hoe_1);

		// Water Axe
		my_axe_2 = new MyAxe2("my_axe_2", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_axe_2);

		// Water Pickaxe
		my_pickaxe_2 = new MyPickaxe2("my_pickaxe_2", 2, 2, my_tool_material_2);
		event.getRegistry().register(my_pickaxe_2);

		// Water Shovel
		my_shovel_2 = new MyShovel2("my_shovel_2", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_shovel_2);

		// Water Hoe
		my_hoe_2 = new MyHoe2("my_hoe_2", 1, 2, my_tool_material_2);
		event.getRegistry().register(my_hoe_2);

		// Fire Axe
		my_axe_3 = new MyAxe3("my_axe_3", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_axe_3);

		// Fire Pickaxe
		my_pickaxe_3 = new MyPickaxe3("my_pickaxe_3", 2, 2, my_tool_material_2);
		event.getRegistry().register(my_pickaxe_3);

		// Fire Shovel
		my_shovel_3 = new MyShovel3("my_shovel_3", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_shovel_3);

		// Fire Hoe
		my_hoe_3 = new MyHoe3("my_hoe_3", 1, 2, my_tool_material_2);
		event.getRegistry().register(my_hoe_3);

		// Air Axe
		my_axe_4 = new MyAxe4("my_axe_4", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_axe_4);

		// Air Pickaxe
		my_pickaxe_4 = new MyPickaxe4("my_pickaxe_4", 2, 2, my_tool_material_2);
		event.getRegistry().register(my_pickaxe_4);

		// Air Shovel
		my_shovel_4 = new MyShovel4("my_shovel_4", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_shovel_4);

		// Air Hoe
		my_hoe_4 = new MyHoe4("my_hoe_4", 1, 2, my_tool_material_2);
		event.getRegistry().register(my_hoe_4);

		// Earth Axe
		my_axe_5 = new MyAxe5("my_axe_5", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_axe_5);

		// Earth Pickaxe
		my_pickaxe_5 = new MyPickaxe5("my_pickaxe_5", 2, 2, my_tool_material_2);
		event.getRegistry().register(my_pickaxe_5);

		// Earth Shovel
		my_shovel_5 = new MyShovel5("my_shovel_5", 2, 2F, my_tool_material_2);
		event.getRegistry().register(my_shovel_5);

		// Earth Hoe
		my_hoe_5 = new MyHoe5("my_hoe_5", 1, 2, my_tool_material_2);
		event.getRegistry().register(my_hoe_5);

		// Astral Staff
		my_sword_2 = new MySword2("my_sword_2", my_tool_material_1);
		event.getRegistry().register(my_sword_2);

		// Water Crystal
		my_item_2 = new MyItem2("my_item_2");
		event.getRegistry().register(my_item_2);

		// Fire Crystal
		my_item_3 = new MyItem3("my_item_3");
		event.getRegistry().register(my_item_3);

		// Sky Crystal
		my_item_4 = new MyItem4("my_item_4");
		event.getRegistry().register(my_item_4);

		// Earth Crystal
		my_item_5 = new MyItem5("my_item_5");
		event.getRegistry().register(my_item_5);

	}
}
