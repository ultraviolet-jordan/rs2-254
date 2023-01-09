import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public int anInt175;

	@OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "I")
	public int anInt179;

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!bb", name = "Kb", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!bb", name = "Lb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!bb", name = "Ob", descriptor = "Lclient!gc;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "B")
	private byte aByte8 = 8;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "[I")
	public int[] anIntArray18 = new int[12];

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "[I")
	public int[] anIntArray19 = new int[5];

	@OriginalMember(owner = "client!bb", name = "Mb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bb", name = "Nb", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!mb;Z)V")
	public void method51(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		try {
			arg0.anInt777 = 0;
			this.anInt174 = arg0.get1();
			this.anInt175 = arg0.get1();
			this.aClass13_2 = null;
			@Pc(22) int local22;
			@Pc(34) int local34;
			for (@Pc(17) int local17 = 0; local17 < 12; local17++) {
				local22 = arg0.get1();
				if (local22 == 0) {
					this.anIntArray18[local17] = 0;
				} else {
					local34 = arg0.get1();
					this.anIntArray18[local17] = (local22 << 8) + local34;
					if (local17 == 0 && this.anIntArray18[0] == 65535) {
						this.aClass13_2 = Static12.method320(arg0.get2());
						break;
					}
				}
			}
			for (local22 = 0; local22 < 5; local22++) {
				local34 = arg0.get1();
				if (local34 < 0 || local34 >= Static6.anIntArrayArray4[local22].length) {
					local34 = 0;
				}
				this.anIntArray19[local22] = local34;
			}
			super.anInt131 = arg0.get2();
			if (!arg1) {
				for (local34 = 1; local34 > 0; local34++) {
				}
			}
			if (super.anInt131 == 65535) {
				super.anInt131 = -1;
			}
			super.anInt132 = arg0.get2();
			if (super.anInt132 == 65535) {
				super.anInt132 = -1;
			}
			super.anInt133 = arg0.get2();
			if (super.anInt133 == 65535) {
				super.anInt133 = -1;
			}
			super.anInt134 = arg0.get2();
			if (super.anInt134 == 65535) {
				super.anInt134 = -1;
			}
			super.anInt135 = arg0.get2();
			if (super.anInt135 == 65535) {
				super.anInt135 = -1;
			}
			super.anInt136 = arg0.get2();
			if (super.anInt136 == 65535) {
				super.anInt136 = -1;
			}
			super.anInt137 = arg0.get2();
			if (super.anInt137 == 65535) {
				super.anInt137 = -1;
			}
			this.aString4 = Static36.method683(true, Static36.method680(arg0.get8(0), true));
			this.anInt176 = arg0.get1();
			this.aBoolean29 = true;
			this.aLong9 = 0L;
			for (local34 = 0; local34 < 12; local34++) {
				this.aLong9 <<= 0x4;
				if (this.anIntArray18[local34] >= 256) {
					this.aLong9 += this.anIntArray18[local34] - 256;
				}
			}
			if (this.anIntArray18[0] >= 256) {
				this.aLong9 += this.anIntArray18[0] - 256 >> 4;
			}
			if (this.anIntArray18[1] >= 256) {
				this.aLong9 += this.anIntArray18[1] - 256 >> 8;
			}
			for (@Pc(267) int local267 = 0; local267 < 5; local267++) {
				this.aLong9 <<= 0x3;
				this.aLong9 += this.anIntArray19[local267];
			}
			this.aLong9 <<= 0x1;
			this.aLong9 += this.anInt174;
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("11861, " + arg0 + ", " + arg1 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean29) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method52(0);
			if (local10 == null) {
				return null;
			}
			super.anInt168 = local10.anInt566;
			if (arg0 != 45160) {
				throw new NullPointerException();
			}
			local10.aBoolean133 = true;
			if (this.aBoolean30) {
				return local10;
			}
			if (super.anInt155 != -1 && super.anInt156 != -1) {
				@Pc(46) Class32 local46 = Static25.aClass32Array1[super.anInt155];
				@Pc(49) Class1_Sub1_Sub1_Sub5 local49 = local46.method530();
				if (local49 != null) {
					@Pc(63) Class1_Sub1_Sub1_Sub5 local63 = new Class1_Sub1_Sub1_Sub5(Static13.method328((byte) 8, super.anInt156), 992, false, true, local49);
					local63.method301((byte) -32, 0, 0, -super.anInt159);
					local63.method295((byte) 112);
					local63.method296(true, local46.aClass27_2.anIntArray227[super.anInt156]);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local46.anInt846 != 128 || local46.anInt847 != 128) {
						local63.method304(792, local46.anInt846, local46.anInt846, local46.anInt847);
					}
					local63.method305(local46.anInt849 + 64, local46.anInt850 + 850, -30, -50, -30, true);
					@Pc(131) Class1_Sub1_Sub1_Sub5[] local131 = new Class1_Sub1_Sub1_Sub5[] { local10, local63 };
					local10 = new Class1_Sub1_Sub1_Sub5((byte) 9, 2, local131, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (Static6.anInt426 >= this.anInt179) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (Static6.anInt426 >= this.anInt178 && Static6.anInt426 < this.anInt179) {
					@Pc(160) Class1_Sub1_Sub1_Sub5 local160 = this.aClass1_Sub1_Sub1_Sub5_1;
					local160.method301((byte) -32, this.anInt180 - super.anInt127, this.anInt182 - super.anInt128, this.anInt181 - this.anInt177);
					if (super.anInt169 == 512) {
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
					} else if (super.anInt169 == 1024) {
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
					} else if (super.anInt169 == 1536) {
						local160.method299(this.aByte8);
					}
					@Pc(229) Class1_Sub1_Sub1_Sub5[] local229 = new Class1_Sub1_Sub1_Sub5[] { local10, local160 };
					local10 = new Class1_Sub1_Sub1_Sub5((byte) 9, 2, local229, true);
					if (super.anInt169 == 512) {
						local160.method299(this.aByte8);
					} else if (super.anInt169 == 1024) {
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
					} else if (super.anInt169 == 1536) {
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
						local160.method299(this.aByte8);
					}
					local160.method301((byte) -32, super.anInt127 - this.anInt180, super.anInt128 - this.anInt182, this.anInt177 - this.anInt181);
				}
			}
			local10.aBoolean133 = true;
			return local10;
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("83988, " + arg0 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method52(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (this.aClass13_2 == null) {
				@Pc(54) long local54 = this.aLong9;
				@Pc(56) int local56 = -1;
				@Pc(58) int local58 = -1;
				@Pc(60) int local60 = -1;
				@Pc(62) int local62 = -1;
				if (super.anInt150 >= 0 && super.anInt153 == 0) {
					@Pc(73) Class27 local73 = Static23.aClass27Array1[super.anInt150];
					local56 = local73.anIntArray227[super.anInt151];
					if (super.anInt147 >= 0 && super.anInt147 != super.anInt131) {
						local58 = Static23.aClass27Array1[super.anInt147].anIntArray227[super.anInt148];
					}
					if (local73.anInt812 >= 0) {
						local60 = local73.anInt812;
						local54 += local60 - this.anIntArray18[5] << 8;
					}
					if (local73.anInt813 >= 0) {
						local62 = local73.anInt813;
						local54 += local62 - this.anIntArray18[3] << 16;
					}
				} else if (super.anInt147 >= 0) {
					local56 = Static23.aClass27Array1[super.anInt147].anIntArray227[super.anInt148];
				}
				@Pc(151) Class1_Sub1_Sub1_Sub5 local151 = (Class1_Sub1_Sub1_Sub5) Static3.aClass42_1.method641(local54);
				@Pc(157) int local157;
				@Pc(164) int local164;
				if (local151 == null) {
					@Pc(155) boolean local155 = false;
					for (local157 = 0; local157 < 12; local157++) {
						local164 = this.anIntArray18[local157];
						if (local62 >= 0 && local157 == 3) {
							local164 = local62;
						}
						if (local60 >= 0 && local157 == 5) {
							local164 = local60;
						}
						if (local164 >= 256 && local164 < 512 && !Static20.aClass23Array1[local164 - 256].method479(false)) {
							local155 = true;
						}
						if (local164 >= 512 && !Static15.method345(local164 - 512).method352((byte) 3, this.anInt174)) {
							local155 = true;
						}
					}
					if (local155) {
						if (this.aLong10 != -1L) {
							local151 = (Class1_Sub1_Sub1_Sub5) Static3.aClass42_1.method641(this.aLong10);
						}
						if (local151 == null) {
							return null;
						}
					}
				}
				if (local151 == null) {
					@Pc(234) Class1_Sub1_Sub1_Sub5[] local234 = new Class1_Sub1_Sub1_Sub5[12];
					local157 = 0;
					@Pc(245) int local245;
					for (local164 = 0; local164 < 12; local164++) {
						local245 = this.anIntArray18[local164];
						if (local62 >= 0 && local164 == 3) {
							local245 = local62;
						}
						if (local60 >= 0 && local164 == 5) {
							local245 = local60;
						}
						@Pc(273) Class1_Sub1_Sub1_Sub5 local273;
						if (local245 >= 256 && local245 < 512) {
							local273 = Static20.aClass23Array1[local245 - 256].method480(true);
							if (local273 != null) {
								local234[local157++] = local273;
							}
						}
						if (local245 >= 512) {
							local273 = Static15.method345(local245 - 512).method353(135, this.anInt174);
							if (local273 != null) {
								local234[local157++] = local273;
							}
						}
					}
					local151 = new Class1_Sub1_Sub1_Sub5(local234, local157, -928);
					for (local245 = 0; local245 < 5; local245++) {
						if (this.anIntArray19[local245] != 0) {
							local151.method302(Static6.anIntArrayArray4[local245][0], Static6.anIntArrayArray4[local245][this.anIntArray19[local245]]);
							if (local245 == 1) {
								local151.method302(Static6.anIntArray49[0], Static6.anIntArray49[this.anIntArray19[local245]]);
							}
						}
					}
					local151.method295((byte) 112);
					local151.method305(64, 850, -30, -50, -30, true);
					Static3.aClass42_1.method642(local151, false, local54);
					this.aLong10 = local54;
				}
				if (this.aBoolean30) {
					return local151;
				}
				@Pc(378) Class1_Sub1_Sub1_Sub5 local378 = Static11.aClass1_Sub1_Sub1_Sub5_2;
				local378.method290(Static13.method328((byte) 8, local56) & Static13.method328((byte) 8, local58), 764, local151);
				if (local56 != -1 && local58 != -1) {
					local378.method297(Static23.aClass27Array1[super.anInt150].anIntArray230, -620, local56, local58);
				} else if (local56 != -1) {
					local378.method296(true, local56);
				}
				local378.method292(-15382);
				local378.anIntArrayArray8 = null;
				local378.anIntArrayArray7 = null;
				return local378;
			} else {
				@Pc(12) int local12 = -1;
				if (super.anInt150 >= 0 && super.anInt153 == 0) {
					local12 = Static23.aClass27Array1[super.anInt150].anIntArray227[super.anInt151];
				} else if (super.anInt147 >= 0) {
					local12 = Static23.aClass27Array1[super.anInt147].anIntArray227[super.anInt148];
				}
				return this.aClass13_2.method322(0, local12, null, -1);
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("12825, " + arg0 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method53(@OriginalArg(0) boolean arg0) {
		try {
			if (!this.aBoolean29) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray18[local10];
				if (local17 >= 256 && local17 < 512 && !Static20.aClass23Array1[local17 - 256].method481(0)) {
					local8 = true;
				}
				if (local17 >= 512 && !Static15.method345(local17 - 512).method354(false, this.anInt174)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(60) int local60 = 0;
			for (@Pc(62) int local62 = 0; local62 < 12; local62++) {
				@Pc(69) int local69 = this.anIntArray18[local62];
				@Pc(83) Class1_Sub1_Sub1_Sub5 local83;
				if (local69 >= 256 && local69 < 512) {
					local83 = Static20.aClass23Array1[local69 - 256].method482((byte) 9);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
				if (local69 >= 512) {
					local83 = Static15.method345(local69 - 512).method355(true, this.anInt174);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
			}
			@Pc(120) Class1_Sub1_Sub1_Sub5 local120 = new Class1_Sub1_Sub1_Sub5(local58, local60, -928);
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				if (this.anIntArray19[local122] != 0) {
					local120.method302(Static6.anIntArrayArray4[local122][0], Static6.anIntArrayArray4[local122][this.anIntArray19[local122]]);
					if (local122 == 1) {
						local120.method302(Static6.anIntArray49[0], Static6.anIntArray49[this.anIntArray19[local122]]);
					}
				}
			}
			if (arg0) {
				throw new NullPointerException();
			}
			return local120;
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("78326, " + arg0 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method49(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				this.aBoolean28 = !this.aBoolean28;
			}
			return this.aBoolean29;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("44775, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
