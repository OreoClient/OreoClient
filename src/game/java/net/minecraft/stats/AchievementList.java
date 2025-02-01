package net.minecraft.stats;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JsonSerializableSet;

/**+
 * This portion of EaglercraftX contains deobfuscated Minecraft 1.8 source code.
 * 
 * Minecraft 1.8.8 bytecode is (c) 2015 Mojang AB. "Do not distribute!"
 * Mod Coder Pack v9.18 deobfuscation configs are (c) Copyright by the MCP Team
 * 
 * EaglercraftX 1.8 patch files (c) 2022-2024 lax1dude, ayunami2000. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class AchievementList {
	public static int minDisplayColumn;
	public static int minDisplayRow;
	public static int maxDisplayColumn;
	public static int maxDisplayRow;
	public static List<Achievement> achievementList;
	public static Achievement openInventory;
	public static Achievement mineWood;
	public static Achievement buildWorkBench;
	public static Achievement buildPickaxe;
	public static Achievement buildFurnace;
	public static Achievement acquireIron;
	public static Achievement buildHoe;
	public static Achievement makeBread;
	public static Achievement bakeCake;
	public static Achievement buildBetterPickaxe;
	public static Achievement cookFish;
	public static Achievement onARail;
	public static Achievement buildSword;
	public static Achievement killEnemy;
	public static Achievement killCow;
	public static Achievement flyPig;
	public static Achievement snipeSkeleton;
	public static Achievement diamonds;
	public static Achievement diamondsToYou;
	public static Achievement portal;
	public static Achievement ghast;
	public static Achievement blazeRod;
	public static Achievement potion;
	public static Achievement theEnd;
	public static Achievement theEnd2;
	public static Achievement enchantments;
	public static Achievement overkill;
	public static Achievement bookcase;
	public static Achievement breedCow;
	public static Achievement spawnWither;
	public static Achievement killWither;
	public static Achievement fullBeacon;
	public static Achievement exploreAllBiomes;
	public static Achievement overpowered;

	/**+
	 * A stub functions called to make the static initializer for
	 * this class run.
	 */
	public static void init() {
		achievementList = Lists.newArrayList();
		openInventory = (new Achievement("achievement.openInventory", "openInventory", 0, 0, Items.aicon,
				(Achievement) null)).initIndependentStat().registerStat();
		mineWood = (new Achievement("achievement.mineWood", "mineWood", 2, 1, Items.aicon, openInventory))
				.registerStat();
		buildWorkBench = (new Achievement("achievement.buildWorkBench", "buildWorkBench", 4, -1, Items.aicon,
				mineWood)).registerStat();
		buildPickaxe = (new Achievement("achievement.buildPickaxe", "buildPickaxe", 4, 2, Items.aicon,
				buildWorkBench)).registerStat();
		buildFurnace = (new Achievement("achievement.buildFurnace", "buildFurnace", 3, 4, Items.aicon, buildPickaxe))
				.registerStat();
		acquireIron = (new Achievement("achievement.acquireIron", "acquireIron", 1, 4, Items.aicon, buildFurnace))
				.registerStat();
		buildHoe = (new Achievement("achievement.buildHoe", "buildHoe", 2, -3, Items.aicon, buildWorkBench))
				.registerStat();
		makeBread = (new Achievement("achievement.makeBread", "makeBread", -1, -3, Items.aicon, buildHoe))
				.registerStat();
		bakeCake = (new Achievement("achievement.bakeCake", "bakeCake", 0, -5, Items.aicon, buildHoe)).registerStat();
		buildBetterPickaxe = (new Achievement("achievement.buildBetterPickaxe", "buildBetterPickaxe", 6, 2,
				Items.stone_pickaxe, buildPickaxe)).registerStat();
		cookFish = (new Achievement("achievement.cookFish", "cookFish", 2, 6, Items.aicon, buildFurnace))
				.registerStat();
		onARail = (new Achievement("achievement.onARail", "onARail", 2, 3, Items.aicon, acquireIron)).setSpecial()
				.registerStat();
		buildSword = (new Achievement("achievement.buildSword", "buildSword", 6, -1, Items.aicon,
				buildWorkBench)).registerStat();
		killEnemy = (new Achievement("achievement.killEnemy", "killEnemy", 8, -1, Items.aicon, buildSword))
				.registerStat();
		killCow = (new Achievement("achievement.killCow", "killCow", 7, -3, Items.aicon, buildSword)).registerStat();
		flyPig = (new Achievement("achievement.flyPig", "flyPig", 9, -3, Items.aicon, killCow)).setSpecial()
				.registerStat();
		snipeSkeleton = (new Achievement("achievement.snipeSkeleton", "snipeSkeleton", 7, 0, Items.aicon, killEnemy))
				.setSpecial().registerStat();
		diamonds = (new Achievement("achievement.diamonds", "diamonds", -1, 5, Items.aicon, acquireIron))
				.registerStat();
		diamondsToYou = (new Achievement("achievement.diamondsToYou", "diamondsToYou", -1, 2, Items.aicon, diamonds))
				.registerStat();
		portal = (new Achievement("achievement.portal", "portal", -1, 7, Items.aicon, diamonds)).registerStat();
		ghast = (new Achievement("achievement.ghast", "ghast", -4, 8, Items.aicon, portal)).setSpecial()
				.registerStat();
		blazeRod = (new Achievement("achievement.blazeRod", "blazeRod", 0, 9, Items.aicon, portal)).registerStat();
		potion = (new Achievement("achievement.potion", "potion", 2, 8, Items.aicon, blazeRod)).registerStat();
		theEnd = (new Achievement("achievement.theEnd", "theEnd", 3, 10, Items.aicon, blazeRod)).setSpecial()
				.registerStat();
		theEnd2 = (new Achievement("achievement.theEnd2", "theEnd2", 4, 13, Items.aicon, theEnd)).setSpecial()
				.registerStat();
		enchantments = (new Achievement("achievement.enchantments", "enchantments", -4, 4, Items.aicon,
				diamonds)).registerStat();
		overkill = (new Achievement("achievement.overkill", "overkill", -4, 1, Items.aicon, enchantments))
				.setSpecial().registerStat();
		bookcase = (new Achievement("achievement.bookcase", "bookcase", -3, 6, Items.aicon, enchantments))
				.registerStat();
		breedCow = (new Achievement("achievement.breedCow", "breedCow", 7, -5, Items.aicon, killCow)).registerStat();
		spawnWither = (new Achievement("achievement.spawnWither", "spawnWither", 7, 12,
				new ItemStack(Items.skull, 1, 1), theEnd2)).registerStat();
		killWither = (new Achievement("achievement.killWither", "killWither", 7, 10, Items.aicon, spawnWither))
				.registerStat();
		fullBeacon = (new Achievement("achievement.fullBeacon", "fullBeacon", 7, 8, Items.aicon, killWither))
				.setSpecial().registerStat();
		exploreAllBiomes = (new Achievement("achievement.exploreAllBiomes", "exploreAllBiomes", 4, 8,
		Items.aicon, theEnd)).func_150953_b(JsonSerializableSet.class, JsonSerializableSet::new)
						.setSpecial().registerStat();
		overpowered = (new Achievement("achievement.overpowered", "overpowered", 6, 4,
				new ItemStack(Items.aicon, 1, 1), buildBetterPickaxe)).setSpecial().registerStat();
	}
}