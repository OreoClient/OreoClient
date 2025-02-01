package net.lax1dude.eaglercraft.v1_8.profile;

import net.minecraft.util.ResourceLocation;

/**
 * Copyright (c) 2022-2023 lax1dude, ayunami2000. All Rights Reserved.
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
public enum DefaultSkins {

	DEFAULT_STEVE(0, "Steve", new ResourceLocation("eagler:skins/steve.png"), SkinModel.STEVE),
	DEFAULT_ALEX(1, "Alex", new ResourceLocation("eagler:skins/alex.png"), SkinModel.ALEX),
	NEW_NOOR(2, "Noor", new ResourceLocation("eagler:skins/noor.png"), SkinModel.ALEX),
	NEW_EFE(3, "Efe", new ResourceLocation("eagler:skins/efe.png"), SkinModel.ALEX),
	NEW_SUNNY(4, "Sunny", new ResourceLocation("eagler:skins/sunny.png"), SkinModel.ALEX),
	NEW_ARI(5, "Ari", new ResourceLocation("eagler:skins/ari.png"), SkinModel.STEVE),
	NEW_ZURI(6, "Zuri", new ResourceLocation("eagler:skins/zuri.png"), SkinModel.STEVE),
	NEW_MAKENA(7, "Makena", new ResourceLocation("eagler:skins/makena.png"), SkinModel.ALEX),
	NEW_KAI(8, "Kai", new ResourceLocation("eagler:skins/kai.png"), SkinModel.STEVE);
	public static final DefaultSkins[] defaultSkinsMap = new DefaultSkins[8];
	
	public final int id;
	public final String name;
	public final ResourceLocation location;
	public final SkinModel model;
	
	private DefaultSkins(int id, String name, ResourceLocation location, SkinModel model) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.model = model;
	}
	
	public static DefaultSkins getSkinFromId(int id) {
		DefaultSkins e = null;
		if(id >= 0 && id < defaultSkinsMap.length) {
			e = defaultSkinsMap[id];
		}
		if(e != null) {
			return e;
		}else {
			return DEFAULT_STEVE;
		}
	}
	
	static {
		DefaultSkins[] skins = values();
		for(int i = 0; i < skins.length; ++i) {
			defaultSkinsMap[skins[i].id] = skins[i];
		}
	}

}
