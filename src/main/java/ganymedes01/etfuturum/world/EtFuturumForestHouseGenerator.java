package ganymedes01.etfuturum.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class EtFuturumForestHouseGenerator implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX^16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		EtFuturumForestHouseGenerator foresthouse = new EtFuturumForestHouseGenerator();
		
		for(int i = 0; i < 2; i++) {
			
			int x = chunkX + rand.nextInt(16);
			int z = chunkZ + rand.nextInt(16);
			int y = world.getHeightValue(x, z);
			foresthouse.generate(world, )
			
			
		}
	}
	
}
