
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

public class PopNadienBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PopNadienBlock() {
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
			default -> Shapes.or(box(7.5, 1.1, 6.3, 8.5, 4.4, 8.3), box(7.5, 2.4, 5.3, 8.5, 4.4, 6.3), box(7.5, 2.4, 8.3, 8.5, 4.4, 9.3), box(6.5, 4.4, 5.6, 9.75, 7.9, 9.1), box(10, 0, 5, 11, 2, 10), box(10, 8, 5, 11, 10, 9), box(5, 0, 4, 6, 10, 10),
					box(5, 0, 10, 11, 10, 11), box(10, 2, 9, 11, 10, 10), box(10, 2, 8, 11, 5, 9), box(6, 2, 4, 7, 10, 5), box(6, 0, 4, 11, 2, 5), box(7, 8, 4, 11, 10, 5), box(6, 0, 5, 10, 1, 10), box(6, 9, 5, 10, 10, 10));
			case NORTH -> Shapes.or(box(7.5, 1.1, 7.7, 8.5, 4.4, 9.7), box(7.5, 2.4, 9.7, 8.5, 4.4, 10.7), box(7.5, 2.4, 6.7, 8.5, 4.4, 7.7), box(6.25, 4.4, 6.9, 9.5, 7.9, 10.4), box(5, 0, 6, 6, 2, 11), box(5, 8, 7, 6, 10, 11),
					box(10, 0, 6, 11, 10, 12), box(5, 0, 5, 11, 10, 6), box(5, 2, 6, 6, 10, 7), box(5, 2, 7, 6, 5, 8), box(9, 2, 11, 10, 10, 12), box(5, 0, 11, 10, 2, 12), box(5, 8, 11, 9, 10, 12), box(6, 0, 6, 10, 1, 11), box(6, 9, 6, 10, 10, 11));
			case EAST -> Shapes.or(box(6.3, 1.1, 7.5, 8.3, 4.4, 8.5), box(5.3, 2.4, 7.5, 6.3, 4.4, 8.5), box(8.3, 2.4, 7.5, 9.3, 4.4, 8.5), box(5.6, 4.4, 6.25, 9.1, 7.9, 9.5), box(5, 0, 5, 10, 2, 6), box(5, 8, 5, 9, 10, 6), box(4, 0, 10, 10, 10, 11),
					box(10, 0, 5, 11, 10, 11), box(9, 2, 5, 10, 10, 6), box(8, 2, 5, 9, 5, 6), box(4, 2, 9, 5, 10, 10), box(4, 0, 5, 5, 2, 10), box(4, 8, 5, 5, 10, 9), box(5, 0, 6, 10, 1, 10), box(5, 9, 6, 10, 10, 10));
			case WEST ->
				Shapes.or(box(7.7, 1.1, 7.5, 9.7, 4.4, 8.5), box(9.7, 2.4, 7.5, 10.7, 4.4, 8.5), box(6.7, 2.4, 7.5, 7.7, 4.4, 8.5), box(6.9, 4.4, 6.5, 10.4, 7.9, 9.75), box(6, 0, 10, 11, 2, 11), box(7, 8, 10, 11, 10, 11), box(6, 0, 5, 12, 10, 6),
						box(5, 0, 5, 6, 10, 11), box(6, 2, 10, 7, 10, 11), box(7, 2, 10, 8, 5, 11), box(11, 2, 6, 12, 10, 7), box(11, 0, 6, 12, 2, 11), box(11, 8, 7, 12, 10, 11), box(6, 0, 6, 11, 1, 10), box(6, 9, 6, 11, 10, 10));
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
