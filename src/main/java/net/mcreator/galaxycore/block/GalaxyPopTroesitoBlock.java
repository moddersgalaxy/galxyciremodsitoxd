
package net.mcreator.galaxycore.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class GalaxyPopTroesitoBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public GalaxyPopTroesitoBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.BAMBOO).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(7.0625, 1.1, 6.7375, 9.0625, 4.4, 7.7375), box(9.0625, 2.4, 6.7375, 10.0625, 4.4, 7.7375), box(6.0625, 2.4, 6.7375, 7.0625, 4.4, 7.7375), box(6.2625, 4.4, 5.7375, 9.7625, 7.9, 8.9875),
					box(5.5, 0, 9.5, 10.5, 2, 10.5), box(6.5, 8, 9.5, 10.5, 10, 10.5), box(5.5, 0, 4.5, 11.5, 10, 5.5), box(4.5, 0, 4.5, 5.5, 10, 10.5), box(5.5, 2, 9.5, 6.5, 10, 10.5), box(6.5, 2, 9.5, 7.5, 5, 10.5),
					box(10.5, 2, 5.5, 11.5, 10, 6.5), box(10.5, 0, 5.5, 11.5, 2, 10.5), box(10.5, 8, 6.5, 11.5, 10, 10.5), box(5.5, 0, 5.5, 10.5, 1, 9.5), box(5.5, 9, 5.5, 10.5, 10, 9.5));
			case NORTH -> Shapes.or(box(6.9375, 1.1, 8.2625, 8.9375, 4.4, 9.2625), box(5.9375, 2.4, 8.2625, 6.9375, 4.4, 9.2625), box(8.9375, 2.4, 8.2625, 9.9375, 4.4, 9.2625), box(6.2375, 4.4, 7.0125, 9.7375, 7.9, 10.2625),
					box(5.5, 0, 5.5, 10.5, 2, 6.5), box(5.5, 8, 5.5, 9.5, 10, 6.5), box(4.5, 0, 10.5, 10.5, 10, 11.5), box(10.5, 0, 5.5, 11.5, 10, 11.5), box(9.5, 2, 5.5, 10.5, 10, 6.5), box(8.5, 2, 5.5, 9.5, 5, 6.5), box(4.5, 2, 9.5, 5.5, 10, 10.5),
					box(4.5, 0, 5.5, 5.5, 2, 10.5), box(4.5, 8, 5.5, 5.5, 10, 9.5), box(5.5, 0, 6.5, 10.5, 1, 10.5), box(5.5, 9, 6.5, 10.5, 10, 10.5));
			case EAST -> Shapes.or(box(6.7375, 1.1, 6.9375, 7.7375, 4.4, 8.9375), box(6.7375, 2.4, 5.9375, 7.7375, 4.4, 6.9375), box(6.7375, 2.4, 8.9375, 7.7375, 4.4, 9.9375), box(5.7375, 4.4, 6.2375, 8.9875, 7.9, 9.7375),
					box(9.5, 0, 5.5, 10.5, 2, 10.5), box(9.5, 8, 5.5, 10.5, 10, 9.5), box(4.5, 0, 4.5, 5.5, 10, 10.5), box(4.5, 0, 10.5, 10.5, 10, 11.5), box(9.5, 2, 9.5, 10.5, 10, 10.5), box(9.5, 2, 8.5, 10.5, 5, 9.5),
					box(5.5, 2, 4.5, 6.5, 10, 5.5), box(5.5, 0, 4.5, 10.5, 2, 5.5), box(6.5, 8, 4.5, 10.5, 10, 5.5), box(5.5, 0, 5.5, 9.5, 1, 10.5), box(5.5, 9, 5.5, 9.5, 10, 10.5));
			case WEST -> Shapes.or(box(8.2625, 1.1, 7.0625, 9.2625, 4.4, 9.0625), box(8.2625, 2.4, 9.0625, 9.2625, 4.4, 10.0625), box(8.2625, 2.4, 6.0625, 9.2625, 4.4, 7.0625), box(7.0125, 4.4, 6.2625, 10.2625, 7.9, 9.7625),
					box(5.5, 0, 5.5, 6.5, 2, 10.5), box(5.5, 8, 6.5, 6.5, 10, 10.5), box(10.5, 0, 5.5, 11.5, 10, 11.5), box(5.5, 0, 4.5, 11.5, 10, 5.5), box(5.5, 2, 5.5, 6.5, 10, 6.5), box(5.5, 2, 6.5, 6.5, 5, 7.5), box(9.5, 2, 10.5, 10.5, 10, 11.5),
					box(5.5, 0, 10.5, 10.5, 2, 11.5), box(5.5, 8, 10.5, 9.5, 10, 11.5), box(6.5, 0, 5.5, 10.5, 1, 10.5), box(6.5, 9, 5.5, 10.5, 10, 10.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
