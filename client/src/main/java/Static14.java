import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static14 {

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt744;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private static int anInt735 = 728;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	private static int anInt736 = -216;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private static int anInt737 = 579;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
	private static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "B")
	private static byte aByte40 = 9;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[II)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray213 = arg2;
			anInt738 = arg3;
			anInt739 = arg1;
			if (arg0 < 0) {
				method455(arg3, true, 0, arg1, 0);
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("39167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method454(@OriginalArg(0) int arg0) {
		try {
			anInt742 = 0;
			anInt740 = 0;
			anInt743 = anInt738;
			anInt741 = anInt739;
			anInt744 = anInt743 - 1;
			if (arg0 > 0) {
				anInt745 = anInt743 / 2;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("15178, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (!arg1) {
				anInt737 = 122;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg0 > anInt738) {
				arg0 = anInt738;
			}
			if (arg3 > anInt739) {
				arg3 = anInt739;
			}
			anInt742 = arg2;
			anInt740 = arg4;
			anInt743 = arg0;
			anInt741 = arg3;
			anInt744 = anInt743 - 1;
			anInt745 = anInt743 / 2;
			anInt746 = anInt741 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("36813, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method456(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt738 * anInt739;
			if (arg0 < 0) {
				for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
					anIntArray213[local12] = 0;
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("8793, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg2 < anInt742) {
				arg5 -= anInt742 - arg2;
				arg2 = anInt742;
			}
			if (arg0 < anInt740) {
				arg4 -= anInt740 - arg0;
				arg0 = anInt740;
			}
			if (arg2 + arg5 > anInt743) {
				arg5 = anInt743 - arg2;
			}
			if (arg0 + arg4 > anInt741) {
				arg4 = anInt741 - arg0;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg6 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg6 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg6 & 0xFF) * arg1;
			@Pc(71) int local71 = anInt738 - arg5;
			@Pc(77) int local77 = arg2 + arg0 * anInt738;
			if (arg3 < 4 || arg3 > 4) {
				aBoolean185 = !aBoolean185;
			}
			for (@Pc(91) int local91 = 0; local91 < arg4; local91++) {
				for (@Pc(96) int local96 = -arg5; local96 < 0; local96++) {
					@Pc(108) int local108 = (anIntArray213[local77] >> 16 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray213[local77] >> 8 & 0xFF) * local45;
					@Pc(126) int local126 = (anIntArray213[local77] & 0xFF) * local45;
					@Pc(148) int local148 = (local53 + local108 >> 8 << 16) + (local61 + local118 >> 8 << 8) + (local67 + local126 >> 8);
					anIntArray213[local77++] = local148;
				}
				local77 += local71;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("6069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 < anInt742) {
				arg1 -= anInt742 - arg2;
				arg2 = anInt742;
			}
			if (arg3 < anInt740) {
				arg0 -= anInt740 - arg3;
				arg3 = anInt740;
			}
			if (arg2 + arg1 > anInt743) {
				arg1 = anInt743 - arg2;
			}
			if (arg3 + arg0 > anInt741) {
				arg0 = anInt741 - arg3;
			}
			@Pc(45) int local45 = anInt738 - arg1;
			@Pc(51) int local51 = arg2 + arg3 * anInt738;
			if (arg4 == 3) {
				@Pc(56) boolean local56 = false;
				for (@Pc(61) int local61 = -arg0; local61 < 0; local61++) {
					for (@Pc(67) int local67 = -arg1; local67 < 0; local67++) {
						anIntArray213[local51++] = arg5;
					}
					local51 += local45;
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("5198, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZII)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (!arg3) {
				aBoolean185 = !aBoolean185;
			}
			method461(arg4, arg2, 4, arg0, arg1);
			method461(arg4, arg2 + arg5 - 1, 4, arg0, arg1);
			method463(arg2, arg5, arg0, arg4, -490);
			method463(arg2, arg5, arg0, arg4 + arg1 - 1, -490);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("96612, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method462(0, arg2, arg6, arg3, arg0, arg4);
			method462(0, arg2, arg6 + arg5 - 1, arg3, arg0, arg4);
			if (arg1 == aByte40) {
				@Pc(22) boolean local22 = false;
			} else {
				anInt735 = -251;
			}
			if (arg5 >= 3) {
				method464(arg4, arg0, true, arg2, arg6 + 1, arg5 - 2);
				method464(arg4 + arg3 - 1, arg0, true, arg2, arg6 + 1, arg5 - 2);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("52295, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 >= anInt740 && arg1 < anInt741) {
				if (arg0 < anInt742) {
					arg4 -= anInt742 - arg0;
					arg0 = anInt742;
				}
				if (arg0 + arg4 > anInt743) {
					arg4 = anInt743 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg1 * anInt738;
				if (arg2 < 4 || arg2 > 4) {
					aBoolean184 = !aBoolean184;
				}
				for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
					anIntArray213[local32 + local46] = arg3;
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("82631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	private static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 >= anInt740 && arg2 < anInt741) {
				if (arg5 < anInt742) {
					arg3 -= anInt742 - arg5;
					arg5 = anInt742;
				}
				if (arg5 + arg3 > anInt743) {
					arg3 = anInt743 - arg5;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(58) int local58 = arg5 + arg2 * anInt738;
				if (arg0 == 0) {
					for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
						@Pc(75) int local75 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
						@Pc(85) int local85 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
						@Pc(93) int local93 = (anIntArray213[local58] & 0xFF) * local30;
						@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
						anIntArray213[local58++] = local115;
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("95619, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			label42: while (true) {
				@Pc(5) int local5;
				if (arg4 >= 0) {
					local5 = 1;
					while (true) {
						if (local5 <= 0) {
							continue label42;
						}
						local5++;
					}
				}
				if (arg3 >= anInt742 && arg3 < anInt743) {
					if (arg0 < anInt740) {
						arg1 -= anInt740 - arg0;
						arg0 = anInt740;
					}
					if (arg0 + arg1 > anInt741) {
						arg1 = anInt741 - arg0;
					}
					local5 = arg3 + arg0 * anInt738;
					for (@Pc(47) int local47 = 0; local47 < arg1; local47++) {
						anIntArray213[local5 + local47 * anInt738] = arg2;
					}
					return;
				}
				return;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("63877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZIII)V")
	private static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 >= anInt742 && arg0 < anInt743) {
				if (arg4 < anInt740) {
					arg5 -= anInt740 - arg4;
					arg4 = anInt740;
				}
				if (arg4 + arg5 > anInt741) {
					arg5 = anInt741 - arg4;
				}
				@Pc(32) int local32 = 256 - arg1;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg1;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg1;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg1;
				@Pc(60) int local60 = arg0 + arg4 * anInt738;
				@Pc(64) int local64;
				if (!arg2) {
					for (local64 = 1; local64 > 0; local64++) {
					}
				}
				for (local64 = 0; local64 < arg5; local64++) {
					@Pc(83) int local83 = (anIntArray213[local60] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray213[local60] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray213[local60] & 0xFF) * local32;
					@Pc(123) int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
					anIntArray213[local60] = local123;
					local60 += anInt738;
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("24723, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
