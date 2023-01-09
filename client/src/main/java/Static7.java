import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static7 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[Lclient!d;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "Lclient!t;")
	private static Class42 aClass42_3;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
	private static boolean aBoolean91 = true;

	@OriginalMember(owner = "client!d", name = "mb", descriptor = "Lclient!t;")
	public static Class42 aClass42_2 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!yb;I[Lclient!lb;Lclient!yb;)V")
	public static void method230(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub4[] arg2, @OriginalArg(3) Class48 arg3) {
		try {
			aClass42_3 = new Class42((byte) 3, 50000);
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg3.method678("data", null), (byte) 3);
			@Pc(21) int local21;
			if (arg1 != 7) {
				for (local21 = 1; local21 > 0; local21++) {
				}
			}
			local21 = -1;
			@Pc(31) int local31 = local16.get2();
			aClass6Array1 = new Class6[local31];
			while (true) {
				@Pc(56) Class6 local56;
				do {
					if (local16.anInt777 >= local16.aByteArray9.length) {
						aClass42_3 = null;
						return;
					}
					@Pc(39) int local39 = local16.get2();
					if (local39 == 65535) {
						local21 = local16.get2();
						local39 = local16.get2();
					}
					local56 = aClass6Array1[local39] = new Class6();
					local56.anInt456 = local39;
					local56.anInt457 = local21;
					local56.anInt458 = local16.get1();
					local56.anInt459 = local16.get1();
					local56.anInt460 = local16.get2();
					local56.anInt461 = local16.get2();
					local56.anInt462 = local16.get2();
					local56.aByte16 = (byte) local16.get1();
					local56.anInt465 = local16.get1();
					if (local56.anInt465 == 0) {
						local56.anInt465 = -1;
					} else {
						local56.anInt465 = (local56.anInt465 - 1 << 8) + local16.get1();
					}
					@Pc(113) int local113 = local16.get1();
					@Pc(125) int local125;
					if (local113 > 0) {
						local56.anIntArray98 = new int[local113];
						local56.anIntArray99 = new int[local113];
						for (local125 = 0; local125 < local113; local125++) {
							local56.anIntArray98[local125] = local16.get1();
							local56.anIntArray99[local125] = local16.get2();
						}
					}
					local125 = local16.get1();
					@Pc(154) int local154;
					@Pc(159) int local159;
					if (local125 > 0) {
						local56.anIntArrayArray6 = new int[local125][];
						for (local154 = 0; local154 < local125; local154++) {
							local159 = local16.get2();
							local56.anIntArrayArray6[local154] = new int[local159];
							for (@Pc(167) int local167 = 0; local167 < local159; local167++) {
								local56.anIntArrayArray6[local154][local167] = local16.get2();
							}
						}
					}
					if (local56.anInt458 == 0) {
						local56.anInt466 = local16.get2();
						local56.aBoolean92 = local16.get1() == 1;
						local154 = local16.get2();
						local56.anIntArray100 = new int[local154];
						local56.anIntArray101 = new int[local154];
						local56.anIntArray102 = new int[local154];
						for (local159 = 0; local159 < local154; local159++) {
							local56.anIntArray100[local159] = local16.get2();
							local56.anIntArray101[local159] = local16.get2LE();
							local56.anIntArray102[local159] = local16.get2LE();
						}
					}
					if (local56.anInt458 == 1) {
						local56.anInt468 = local16.get2();
						local56.aBoolean93 = local16.get1() == 1;
					}
					if (local56.anInt458 == 2) {
						local56.anIntArray96 = new int[local56.anInt461 * local56.anInt462];
						local56.anIntArray97 = new int[local56.anInt461 * local56.anInt462];
						local56.aBoolean94 = local16.get1() == 1;
						local56.aBoolean95 = local16.get1() == 1;
						local56.aBoolean96 = local16.get1() == 1;
						local56.aBoolean97 = local16.get1() == 1;
						local56.anInt469 = local16.get1();
						local56.anInt470 = local16.get1();
						local56.anIntArray103 = new int[20];
						local56.anIntArray104 = new int[20];
						local56.aClass1_Sub1_Sub2_Sub2Array8 = new Class1_Sub1_Sub2_Sub2[20];
						for (local154 = 0; local154 < 20; local154++) {
							local159 = local16.get1();
							if (local159 == 1) {
								local56.anIntArray103[local154] = local16.get2LE();
								local56.anIntArray104[local154] = local16.get2LE();
								@Pc(360) String local360 = local16.getString();
								if (arg0 != null && local360.length() > 0) {
									@Pc(369) int local369 = local360.lastIndexOf(",");
									local56.aClass1_Sub1_Sub2_Sub2Array8[local154] = method235(59, Integer.parseInt(local360.substring(local369 + 1)), local360.substring(0, local369), arg0);
								}
							}
						}
						local56.aStringArray7 = new String[5];
						for (local159 = 0; local159 < 5; local159++) {
							local56.aStringArray7[local159] = local16.getString();
							if (local56.aStringArray7[local159].length() == 0) {
								local56.aStringArray7[local159] = null;
							}
						}
					}
					if (local56.anInt458 == 3) {
						local56.aBoolean98 = local16.get1() == 1;
					}
					if (local56.anInt458 == 4 || local56.anInt458 == 1) {
						local56.aBoolean99 = local16.get1() == 1;
						local154 = local16.get1();
						if (arg2 != null) {
							local56.aClass1_Sub1_Sub2_Sub4_5 = arg2[local154];
						}
						local56.aBoolean100 = local16.get1() == 1;
					}
					if (local56.anInt458 == 4) {
						local56.aString19 = local16.getString();
						local56.aString20 = local16.getString();
					}
					if (local56.anInt458 == 1 || local56.anInt458 == 3 || local56.anInt458 == 4) {
						local56.anInt471 = local16.get4();
					}
					if (local56.anInt458 == 3 || local56.anInt458 == 4) {
						local56.anInt472 = local16.get4();
						local56.anInt473 = local16.get4();
						local56.anInt474 = local16.get4();
					}
					if (local56.anInt458 == 5) {
						@Pc(523) String local523 = local16.getString();
						if (arg0 != null && local523.length() > 0) {
							local159 = local523.lastIndexOf(",");
							local56.aClass1_Sub1_Sub2_Sub2_14 = method235(59, Integer.parseInt(local523.substring(local159 + 1)), local523.substring(0, local159), arg0);
						}
						local523 = local16.getString();
						if (arg0 != null && local523.length() > 0) {
							local159 = local523.lastIndexOf(",");
							local56.aClass1_Sub1_Sub2_Sub2_15 = method235(59, Integer.parseInt(local523.substring(local159 + 1)), local523.substring(0, local159), arg0);
						}
					}
					if (local56.anInt458 == 6) {
						local39 = local16.get1();
						if (local39 != 0) {
							local56.anInt475 = 1;
							local56.anInt476 = (local39 - 1 << 8) + local16.get1();
						}
						local39 = local16.get1();
						if (local39 != 0) {
							local56.anInt477 = 1;
							local56.anInt478 = (local39 - 1 << 8) + local16.get1();
						}
						local39 = local16.get1();
						if (local39 == 0) {
							local56.anInt479 = -1;
						} else {
							local56.anInt479 = (local39 - 1 << 8) + local16.get1();
						}
						local39 = local16.get1();
						if (local39 == 0) {
							local56.anInt480 = -1;
						} else {
							local56.anInt480 = (local39 - 1 << 8) + local16.get1();
						}
						local56.anInt481 = local16.get2();
						local56.anInt482 = local16.get2();
						local56.anInt483 = local16.get2();
					}
					if (local56.anInt458 == 7) {
						local56.anIntArray96 = new int[local56.anInt461 * local56.anInt462];
						local56.anIntArray97 = new int[local56.anInt461 * local56.anInt462];
						local56.aBoolean99 = local16.get1() == 1;
						local154 = local16.get1();
						if (arg2 != null) {
							local56.aClass1_Sub1_Sub2_Sub4_5 = arg2[local154];
						}
						local56.aBoolean100 = local16.get1() == 1;
						local56.anInt471 = local16.get4();
						local56.anInt469 = local16.get2LE();
						local56.anInt470 = local16.get2LE();
						local56.aBoolean95 = local16.get1() == 1;
						local56.aStringArray7 = new String[5];
						for (local159 = 0; local159 < 5; local159++) {
							local56.aStringArray7[local159] = local16.getString();
							if (local56.aStringArray7[local159].length() == 0) {
								local56.aStringArray7[local159] = null;
							}
						}
					}
					if (local56.anInt459 == 2 || local56.anInt458 == 2) {
						local56.aString21 = local16.getString();
						local56.aString22 = local16.getString();
						local56.anInt484 = local16.get2();
					}
				} while (local56.anInt459 != 1 && local56.anInt459 != 4 && local56.anInt459 != 5 && local56.anInt459 != 6);
				local56.aString23 = local16.getString();
				if (local56.aString23.length() == 0) {
					if (local56.anInt459 == 1) {
						local56.aString23 = "Ok";
					}
					if (local56.anInt459 == 4) {
						local56.aString23 = "Select";
					}
					if (local56.anInt459 == 5) {
						local56.aString23 = "Select";
					}
					if (local56.anInt459 == 6) {
						local56.aString23 = "Continue";
					}
				}
			}
		} catch (@Pc(846) RuntimeException local846) {
			signlink.reporterror("93100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local846.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZILclient!fb;I)V")
	public static void method234(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub5 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0) {
				aClass42_2.method643();
				if (arg2 != null && arg3 != 4) {
					aClass42_2.method642(arg2, false, (long) ((arg3 << 16) + arg1));
				}
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("18526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILjava/lang/String;Lclient!yb;)Lclient!jb;")
	private static Class1_Sub1_Sub2_Sub2 method235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class48 arg3) {
		try {
			@Pc(8) long local8 = (Static36.method681(193, arg2) << 8) + (long) arg1;
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = (Class1_Sub1_Sub2_Sub2) aClass42_3.method641(local8);
			if (arg0 <= 0) {
				throw new NullPointerException();
			} else if (local13 == null) {
				try {
					local13 = new Class1_Sub1_Sub2_Sub2(arg3, arg2, arg1);
					aClass42_3.method642(local13, false, local8);
					return local13;
				} catch (@Pc(37) Exception local37) {
					return null;
				}
			} else {
				return local13;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("65773, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
