package blusunrize.immersiveengineering.api;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * Implemented on blocks or TileEntities that can have a transformer 'attached' to them (for example, wooden post).
 */
public interface IPostBlock
{
  /**
   * Returns true if a transformer should render attached to this post
   */
  boolean canConnectTransformer(IBlockAccess world, BlockPos pos);
}
