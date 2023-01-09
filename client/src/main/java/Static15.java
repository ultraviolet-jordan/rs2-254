import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static15 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	private static boolean aBoolean148;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt610;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lclient!hc;")
	private static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private static int anInt611;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	private static int anInt609 = 977;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!t;")
	public static Class42 aClass42_7 = new Class42((byte) 3, 50);

	@OriginalMember(owner = "client!hc", name = "Z", descriptor = "Lclient!t;")
	public static Class42 aClass42_8 = new Class42((byte) 3, 100);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method343(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_9 = new Class1_Sub1_Sub3(arg0.method678("obj.dat", null), (byte) 3);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("obj.idx", null), (byte) 3);
		anInt610 = local19.get2();
		anIntArray175 = new int[anInt610];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt610; local29++) {
			anIntArray175[local29] = local27;
			local27 += local19.get2();
		}
		aClass15Array1 = new Class15[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass15Array1[local49] = new Class15();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method344(@OriginalArg(0) int arg0) {
		try {
			aClass42_7 = null;
			aClass42_8 = null;
			anIntArray175 = null;
			aClass15Array1 = null;
			aClass1_Sub1_Sub3_9 = null;
			@Pc(13) int local13 = 50 / arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("64218, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!hc;")
	public static Class15 method345(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass15Array1[local1].anInt612 == arg0) {
				return aClass15Array1[local1];
			}
		}
		anInt611 = (anInt611 + 1) % 10;
		@Pc(27) Class15 local27 = aClass15Array1[anInt611];
		aClass1_Sub1_Sub3_9.anInt777 = anIntArray175[arg0];
		local27.anInt612 = arg0;
		local27.method346();
		local27.method347(9, aClass1_Sub1_Sub3_9);
		if (local27.anInt633 != -1) {
			local27.method348(false);
		}
		if (!aBoolean151 && local27.aBoolean153) {
			local27.aString26 = "Members Object";
			local27.aByteArray6 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray10 = null;
			local27.aStringArray11 = null;
		}
		return local27;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Lclient!jb;")
	public static Class1_Sub1_Sub2_Sub2 method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(9) Class1_Sub1_Sub2_Sub2 local9;
			if (arg0 == 0) {
				local9 = (Class1_Sub1_Sub2_Sub2) aClass42_8.method641((long) arg2);
				if (local9 != null && local9.anInt691 != arg1 && local9.anInt691 != -1) {
					local9.method669();
					local9 = null;
				}
				if (local9 != null) {
					return local9;
				}
			}
			@Pc(30) Class15 local30 = method345(arg2);
			if (local30.anIntArray178 == null) {
				arg1 = -1;
			}
			if (arg1 > 1) {
				@Pc(40) int local40 = -1;
				for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
					if (arg1 >= local30.anIntArray179[local42] && local30.anIntArray179[local42] != 0) {
						local40 = local30.anIntArray178[local42];
					}
				}
				if (local40 != -1) {
					local30 = method345(local40);
				}
			}
			@Pc(74) Class1_Sub1_Sub1_Sub5 local74 = local30.method349(1);
			if (local74 == null) {
				return null;
			}
			@Pc(80) Class1_Sub1_Sub2_Sub2 local80 = null;
			if (local30.anInt633 != -1) {
				local80 = method351(-1, 10, local30.anInt632, 977);
				if (local80 == null) {
					return null;
				}
			}
			local9 = new Class1_Sub1_Sub2_Sub2(32, 32);
			@Pc(103) int local103 = Static16.anInt661;
			@Pc(105) int local105 = Static16.anInt662;
			@Pc(107) int[] local107 = Static16.anIntArray185;
			@Pc(109) int[] local109 = Static14.anIntArray213;
			@Pc(111) int local111 = Static14.anInt738;
			@Pc(113) int local113 = Static14.anInt739;
			if (arg3 <= 0) {
				aBoolean148 = !aBoolean148;
			}
			@Pc(123) int local123 = Static14.anInt742;
			@Pc(125) int local125 = Static14.anInt743;
			@Pc(127) int local127 = Static14.anInt740;
			@Pc(129) int local129 = Static14.anInt741;
			Static16.aBoolean161 = false;
			Static14.method453(-216, 32, local9.anIntArray210, 32);
			Static14.method458(32, 32, 0, 0, (byte) 3, 0);
			Static16.method371(338);
			@Pc(149) int local149 = local30.anInt614;
			if (arg0 == -1) {
				local149 = (int) ((double) local149 * 1.5D);
			}
			if (arg0 > 0) {
				local149 = (int) ((double) local149 * 1.04D);
			}
			@Pc(175) int local175 = Class1_Sub1_Sub2_Sub1.anIntArray183[local30.anInt615] * local149 >> 16;
			@Pc(184) int local184 = Class1_Sub1_Sub2_Sub1.anIntArray184[local30.anInt615] * local149 >> 16;
			local74.method308(0, local30.anInt616, local30.anInt617, local30.anInt615, local30.anInt618, local175 + local74.anInt566 / 2 + local30.anInt619, local184 + local30.anInt619);
			for (@Pc(210) int local210 = 31; local210 >= 0; local210--) {
				for (local184 = 31; local184 >= 0; local184--) {
					if (local9.anIntArray210[local210 + local184 * 32] == 0) {
						if (local210 > 0 && local9.anIntArray210[local210 + local184 * 32 - 1] > 1) {
							local9.anIntArray210[local210 + local184 * 32] = 1;
						} else if (local184 > 0 && local9.anIntArray210[local210 + (local184 - 1) * 32] > 1) {
							local9.anIntArray210[local210 + local184 * 32] = 1;
						} else if (local210 < 31 && local9.anIntArray210[local210 + local184 * 32 + 1] > 1) {
							local9.anIntArray210[local210 + local184 * 32] = 1;
						} else if (local184 < 31 && local9.anIntArray210[local210 + (local184 + 1) * 32] > 1) {
							local9.anIntArray210[local210 + local184 * 32] = 1;
						}
					}
				}
			}
			@Pc(335) int local335;
			if (arg0 > 0) {
				for (local335 = 31; local335 >= 0; local335--) {
					for (local184 = 31; local184 >= 0; local184--) {
						if (local9.anIntArray210[local335 + local184 * 32] == 0) {
							if (local335 > 0 && local9.anIntArray210[local335 + local184 * 32 - 1] == 1) {
								local9.anIntArray210[local335 + local184 * 32] = arg0;
							} else if (local184 > 0 && local9.anIntArray210[local335 + (local184 - 1) * 32] == 1) {
								local9.anIntArray210[local335 + local184 * 32] = arg0;
							} else if (local335 < 31 && local9.anIntArray210[local335 + local184 * 32 + 1] == 1) {
								local9.anIntArray210[local335 + local184 * 32] = arg0;
							} else if (local184 < 31 && local9.anIntArray210[local335 + (local184 + 1) * 32] == 1) {
								local9.anIntArray210[local335 + local184 * 32] = arg0;
							}
						}
					}
				}
			} else if (arg0 == 0) {
				for (local335 = 31; local335 >= 0; local335--) {
					for (local184 = 31; local184 >= 0; local184--) {
						if (local9.anIntArray210[local335 + local184 * 32] == 0 && local335 > 0 && local184 > 0 && local9.anIntArray210[local335 + (local184 - 1) * 32 - 1] > 0) {
							local9.anIntArray210[local335 + local184 * 32] = 3153952;
						}
					}
				}
			}
			if (local30.anInt633 != -1) {
				local335 = local80.anInt690;
				@Pc(519) int local519 = local80.anInt691;
				local80.anInt690 = 32;
				local80.anInt691 = 32;
				local80.method406(1, 0, 0);
				local80.anInt690 = local335;
				local80.anInt691 = local519;
			}
			if (arg0 == 0) {
				aClass42_8.method642(local9, false, (long) arg2);
			}
			Static14.method453(-216, local113, local109, local111);
			Static14.method455(local125, true, local123, local129, local127);
			Static16.anInt661 = local103;
			Static16.anInt662 = local105;
			Static16.anIntArray185 = local107;
			Static16.aBoolean161 = true;
			if (local30.aBoolean152) {
				local9.anInt690 = 33;
			} else {
				local9.anInt690 = 32;
			}
			local9.anInt691 = arg1;
			return local9;
		} catch (@Pc(580) RuntimeException local580) {
			signlink.reporterror("63267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local580.toString());
			throw new RuntimeException();
		}
	}
}
