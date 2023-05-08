package net.swutm.countrysflags.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.countrysflags.block.custom.*;
import net.swutm.countrysflags.countrysflags;

public class ModBlocks {

    public static final Block FLAG = registerBlock("flag",
            new FlagBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG1 = registerBlock("flag_1",
            new FlagBlock1(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG2 = registerBlock("flag_2",
            new FlagBlock2(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG3 = registerBlock("flag_3",
            new FlagBlock3(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG4 = registerBlock("flag_4",
            new FlagBlock4(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG5 = registerBlock("flag_5",
            new FlagBlock5(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG6 = registerBlock("flag_6",
            new FlagBlock6(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG7 = registerBlock("flag_7",
            new FlagBlock7(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG8 = registerBlock("flag_8",
            new FlagBlock8(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG9 = registerBlock("flag_9",
            new FlagBlock9(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG10 = registerBlock("flag_10",
            new FlagBlock10(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG11 = registerBlock("flag_11",
            new FlagBlock11(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG12 = registerBlock("flag_12",
            new FlagBlock12(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG13 = registerBlock("flag_13",
            new FlagBlock13(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG14 = registerBlock("flag_14",
            new FlagBlock14(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG15 = registerBlock("flag_15",
            new FlagBlock15(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG16 = registerBlock("flag_16",
            new FlagBlock16(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG17 = registerBlock("flag_17",
            new FlagBlock17(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG18 = registerBlock("flag_18",
            new FlagBlock18(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG19 = registerBlock("flag_19",
            new FlagBlock19(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG20 = registerBlock("flag_20",
            new FlagBlock20(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG21 = registerBlock("flag_21",
            new FlagBlock21(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG22 = registerBlock("flag_22",
            new FlagBlock22(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG23 = registerBlock("flag_23",
            new FlagBlock23(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG24 = registerBlock("flag_24",
            new FlagBlock24(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG25 = registerBlock("flag_25",
            new FlagBlock25(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG26 = registerBlock("flag_26",
            new FlagBlock26(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG27 = registerBlock("flag_27",
            new FlagBlock27(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG28 = registerBlock("flag_28",
            new FlagBlock28(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG29 = registerBlock("flag_29",
            new FlagBlock29(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG30 = registerBlock("flag_30",
            new FlagBlock30(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG31 = registerBlock("flag_31",
            new FlagBlock31(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG32 = registerBlock("flag_32",
            new FlagBlock32(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG33 = registerBlock("flag_33",
            new FlagBlock33(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Block FLAG34 = registerBlock("flag_34",
            new FlagBlock34(FabricBlockSettings.of(Material.METAL).nonOpaque()), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(countrysflags.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(countrysflags.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        countrysflags.LOGGER.debug("Registering ModBlocks for " + countrysflags.MOD_ID);
    }
}
