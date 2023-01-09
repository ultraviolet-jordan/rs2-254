import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class39 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt881 = -902;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt882 = -1189;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "B")
	private byte aByte48 = 17;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt883 = 9;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[Lclient!q;")
	private Class33[] aClass33Array1 = new Class33[5000];

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "[I")
	private int[] anIntArray248 = new int[10000];

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "[I")
	private int[] anIntArray249 = new int[10000];

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray18 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "[[[Lclient!w;")
	private Class1_Sub3[][][] aClass1_Sub3ArrayArrayArray1;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II[[[IBI)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][][] arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt884 = arg4;
			this.anInt885 = arg0;
			this.anInt886 = arg1;
			if (arg3 != 56) {
				throw new NullPointerException();
			}
			this.aClass1_Sub3ArrayArrayArray1 = new Class1_Sub3[arg4][arg0][arg1];
			this.anIntArrayArrayArray5 = new int[arg4][arg0 + 1][arg1 + 1];
			this.anIntArrayArrayArray4 = arg2;
			this.method544(29142);
		} catch (@Pc(862) RuntimeException local862) {
			signlink.reporterror("42500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local862.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public void method544(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			for (@Pc(3) int local3 = 0; local3 < this.anInt884; local3++) {
				for (local7 = 0; local7 < this.anInt885; local7++) {
					for (local11 = 0; local11 < this.anInt886; local11++) {
						this.aClass1_Sub3ArrayArrayArray1[local3][local7][local11] = null;
					}
				}
			}
			for (local7 = 0; local7 < Static28.anInt909; local7++) {
				for (local11 = 0; local11 < Static28.anIntArray239[local7]; local11++) {
					Static28.aClass26ArrayArray1[local7][local11] = null;
				}
				Static28.anIntArray239[local7] = 0;
			}
			for (local11 = 0; local11 < this.anInt888; local11++) {
				this.aClass33Array1[local11] = null;
			}
			this.anInt888 = 0;
			@Pc(87) int local87;
			if (arg0 != 29142) {
				for (local87 = 1; local87 > 0; local87++) {
				}
			}
			for (local87 = 0; local87 < Static28.aClass33Array2.length; local87++) {
				Static28.aClass33Array2[local87] = null;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("55905, " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
	public void method545(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6;
			if (arg0 != -9) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			this.anInt887 = arg1;
			for (local6 = 0; local6 < this.anInt885; local6++) {
				for (@Pc(20) int local20 = 0; local20 < this.anInt886; local20++) {
					this.aClass1_Sub3ArrayArrayArray1[arg1][local6][local20] = new Class1_Sub3(arg1, local6, local20);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("28849, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	public void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(10) Class1_Sub3 local10 = this.aClass1_Sub3ArrayArrayArray1[0][arg2][arg1];
			@Pc(15) int local15;
			if (arg0 != 6) {
				for (local15 = 1; local15 > 0; local15++) {
				}
			}
			for (local15 = 0; local15 < 3; local15++) {
				@Pc(44) Class1_Sub3 local44 = this.aClass1_Sub3ArrayArrayArray1[local15][arg2][arg1] = this.aClass1_Sub3ArrayArrayArray1[local15 + 1][arg2][arg1];
				if (local44 != null) {
					local44.anInt977--;
					for (@Pc(54) int local54 = 0; local54 < local44.anInt981; local54++) {
						@Pc(61) Class33 local61 = local44.aClass33Array3[local54];
						if ((local61.anInt862 >> 29 & 0x3) == 2 && local61.anInt856 == arg2 && local61.anInt858 == arg1) {
							local61.anInt851--;
						}
					}
				}
			}
			if (this.aClass1_Sub3ArrayArrayArray1[0][arg2][arg1] == null) {
				this.aClass1_Sub3ArrayArrayArray1[0][arg2][arg1] = new Class1_Sub3(0, arg2, arg1);
			}
			this.aClass1_Sub3ArrayArrayArray1[0][arg2][arg1].aClass1_Sub3_1 = local10;
			this.aClass1_Sub3ArrayArrayArray1[3][arg2][arg1] = null;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("14843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	public void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2].anInt983 = arg3;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(14) Class30 local14;
		@Pc(16) int local16;
		if (arg3 == 0) {
			local14 = new Class30(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local16 = arg0; local16 >= 0; local16--) {
				if (this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] == null) {
					this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] = new Class1_Sub3(local16, arg1, arg2);
				}
			}
			this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2].aClass30_1 = local14;
		} else if (arg3 == 1) {
			local14 = new Class30(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local16 = arg0; local16 >= 0; local16--) {
				if (this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] == null) {
					this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] = new Class1_Sub3(local16, arg1, arg2);
				}
			}
			this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2].aClass30_1 = local14;
		} else {
			@Pc(145) Class18 local145 = new Class18(arg13, arg17, arg9, arg6, arg1, arg3, arg2, arg15, arg5, arg10, arg11, arg18, arg4, arg14, arg12, arg16, arg7, arg8, arg19, 407);
			for (local16 = arg0; local16 >= 0; local16--) {
				if (this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] == null) {
					this.aClass1_Sub3ArrayArrayArray1[local16][arg1][arg2] = new Class1_Sub3(local16, arg1, arg2);
				}
			}
			this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2].aClass18_1 = local145;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!y;IIIIIIB)V")
	public void method550(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		try {
			if (arg0 != null) {
				@Pc(6) Class20 local6 = new Class20();
				local6.aClass1_Sub1_Sub1_2 = arg0;
				local6.anInt699 = arg1 * 128 + 64;
				local6.anInt700 = arg5 * 128 + 64;
				local6.anInt698 = arg6;
				local6.anInt701 = arg2;
				local6.aByte36 = arg7;
				if (this.aClass1_Sub3ArrayArrayArray1[arg4][arg1][arg5] == null) {
					this.aClass1_Sub3ArrayArrayArray1[arg4][arg1][arg5] = new Class1_Sub3(arg4, arg1, arg5);
				}
				this.aClass1_Sub3ArrayArrayArray1[arg4][arg1][arg5].aClass20_1 = local6;
				if (arg3 >= 0) {
					this.aBoolean223 = !this.aBoolean223;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("20777, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!y;IILclient!y;IZIILclient!y;)V")
	public void method551(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8) {
		try {
			@Pc(3) Class22 local3 = new Class22();
			local3.aClass1_Sub1_Sub1_3 = arg0;
			local3.anInt731 = arg6 * 128 + 64;
			if (!arg5) {
				this.anInt883 = 62;
			}
			local3.anInt732 = arg7 * 128 + 64;
			local3.anInt730 = arg2;
			local3.anInt733 = arg1;
			local3.aClass1_Sub1_Sub1_4 = arg8;
			local3.aClass1_Sub1_Sub1_5 = arg3;
			@Pc(39) int local39 = 0;
			@Pc(48) Class1_Sub3 local48 = this.aClass1_Sub3ArrayArrayArray1[arg4][arg6][arg7];
			if (local48 != null) {
				for (@Pc(52) int local52 = 0; local52 < local48.anInt981; local52++) {
					if (local48.aClass33Array3[local52].aClass1_Sub1_Sub1_6 instanceof Class1_Sub1_Sub1_Sub5) {
						@Pc(69) int local69 = ((Class1_Sub1_Sub1_Sub5) local48.aClass33Array3[local52].aClass1_Sub1_Sub1_6).anInt555;
						if (local69 > local39) {
							local39 = local69;
						}
					}
				}
			}
			local3.anInt734 = local39;
			if (this.aClass1_Sub3ArrayArrayArray1[arg4][arg6][arg7] == null) {
				this.aClass1_Sub3ArrayArrayArray1[arg4][arg6][arg7] = new Class1_Sub3(arg4, arg6, arg7);
			}
			this.aClass1_Sub3ArrayArrayArray1[arg4][arg6][arg7].aClass22_1 = local3;
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("98507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!y;Lclient!y;IIIBBIIII)V")
	public void method552(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg0 != null || arg1 != null) {
				@Pc(10) Class36 local10 = new Class36();
				local10.anInt872 = arg2;
				local10.aByte47 = arg6;
				local10.anInt868 = arg7 * 128 + 64;
				local10.anInt869 = arg4 * 128 + 64;
				local10.anInt867 = arg8;
				local10.aClass1_Sub1_Sub1_7 = arg0;
				local10.aClass1_Sub1_Sub1_8 = arg1;
				local10.anInt870 = arg9;
				local10.anInt871 = arg3;
				@Pc(50) int local50;
				if (arg5 != 54) {
					for (local50 = 1; local50 > 0; local50++) {
					}
				}
				for (local50 = arg10; local50 >= 0; local50--) {
					if (this.aClass1_Sub3ArrayArrayArray1[local50][arg7][arg4] == null) {
						this.aClass1_Sub3ArrayArrayArray1[local50][arg7][arg4] = new Class1_Sub3(local50, arg7, arg4);
					}
				}
				this.aClass1_Sub3ArrayArrayArray1[arg10][arg7][arg4].aClass36_1 = local10;
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("85333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBIIIIIILclient!y;IZ)V")
	public void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class1_Sub1_Sub1 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		try {
			if (arg9 != null) {
				@Pc(6) Class16 local6 = new Class16();
				local6.anInt644 = arg5;
				local6.aByte30 = arg2;
				if (!arg11) {
					local6.anInt640 = arg4 * 128 + arg1 + 64;
					local6.anInt641 = arg7 * 128 + arg8 + 64;
					local6.anInt639 = arg3;
					local6.aClass1_Sub1_Sub1_1 = arg9;
					local6.anInt642 = arg0;
					local6.anInt643 = arg6;
					for (@Pc(47) int local47 = arg10; local47 >= 0; local47--) {
						if (this.aClass1_Sub3ArrayArrayArray1[local47][arg4][arg7] == null) {
							this.aClass1_Sub3ArrayArrayArray1[local47][arg4][arg7] = new Class1_Sub3(local47, arg4, arg7);
						}
					}
					this.aClass1_Sub3ArrayArrayArray1[arg10][arg4][arg7].aClass16_1 = local6;
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("96788, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BIILclient!y;IIIIIII)Z")
	public boolean method554(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg3 == null) {
				return true;
			}
			@Pc(11) int local11 = arg8 * 128 + arg1 * 64;
			@Pc(19) int local19 = arg7 * 128 + arg5 * 64;
			if (arg4 != -38295) {
				this.anInt881 = -432;
			}
			return this.method557(arg10, arg8, arg7, arg1, arg5, local11, local19, arg2, arg3, arg9, false, arg6, arg0);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("96514, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIILclient!y;ZIIZI)Z")
	public boolean method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			if (arg4 == null) {
				return true;
			}
			@Pc(7) int local7 = arg3 - arg2;
			@Pc(11) int local11 = arg9 - arg2;
			@Pc(15) int local15 = arg3 + arg2;
			@Pc(19) int local19 = arg9 + arg2;
			if (arg8) {
				if (arg0 > 640 && arg0 < 1408) {
					local19 += 128;
				}
				if (arg0 > 1152 && arg0 < 1920) {
					local15 += 128;
				}
				if (arg0 > 1664 || arg0 < 384) {
					local11 -= 128;
				}
				if (arg0 > 128 && arg0 < 896) {
					local7 -= 128;
				}
			}
			local7 /= 128;
			if (!arg5) {
				throw new NullPointerException();
			}
			local11 /= 128;
			local15 /= 128;
			local19 /= 128;
			return this.method557(arg7, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg3, arg9, arg6, arg4, arg0, true, arg1, (byte) 0);
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("96611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIILclient!y;IIZIII)Z")
	public boolean method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		try {
			if (!arg9) {
				this.aBoolean221 = !this.aBoolean221;
			}
			return arg6 == null ? true : this.method557(arg11, arg7, arg2, arg12 + 1 - arg7, arg4 - arg2 + 1, arg8, arg5, arg0, arg6, arg1, true, arg10, (byte) 0);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("45020, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIILclient!y;IZIB)Z")
	private boolean method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12) {
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg3; local3++) {
			for (@Pc(7) int local7 = arg2; local7 < arg2 + arg4; local7++) {
				if (local3 < 0 || local7 < 0 || local3 >= this.anInt885 || local7 >= this.anInt886) {
					return false;
				}
				@Pc(32) Class1_Sub3 local32 = this.aClass1_Sub3ArrayArrayArray1[arg0][local3][local7];
				if (local32 != null && local32.anInt981 >= 5) {
					return false;
				}
			}
		}
		@Pc(56) Class33 local56 = new Class33();
		local56.anInt862 = arg11;
		local56.aByte46 = arg12;
		local56.anInt851 = arg0;
		local56.anInt853 = arg5;
		local56.anInt854 = arg6;
		local56.anInt852 = arg7;
		local56.aClass1_Sub1_Sub1_6 = arg8;
		local56.anInt855 = arg9;
		local56.anInt856 = arg1;
		local56.anInt858 = arg2;
		local56.anInt857 = arg1 + arg3 - 1;
		local56.anInt859 = arg2 + arg4 - 1;
		for (@Pc(102) int local102 = arg1; local102 < arg1 + arg3; local102++) {
			for (@Pc(106) int local106 = arg2; local106 < arg2 + arg4; local106++) {
				@Pc(110) int local110 = 0;
				if (local102 > arg1) {
					local110++;
				}
				if (local102 < arg1 + arg3 - 1) {
					local110 += 4;
				}
				if (local106 > arg2) {
					local110 += 8;
				}
				if (local106 < arg2 + arg4 - 1) {
					local110 += 2;
				}
				for (@Pc(136) int local136 = arg0; local136 >= 0; local136--) {
					if (this.aClass1_Sub3ArrayArrayArray1[local136][local102][local106] == null) {
						this.aClass1_Sub3ArrayArrayArray1[local136][local102][local106] = new Class1_Sub3(local136, local102, local106);
					}
				}
				@Pc(173) Class1_Sub3 local173 = this.aClass1_Sub3ArrayArrayArray1[arg0][local102][local106];
				local173.aClass33Array3[local173.anInt981] = local56;
				local173.anIntArray264[local173.anInt981] = local110;
				local173.anInt982 |= local110;
				local173.anInt981++;
			}
		}
		if (arg10) {
			this.aClass33Array1[this.anInt888++] = local56;
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	public void method558(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.anInt883 = -396;
			}
			for (@Pc(10) int local10 = 0; local10 < this.anInt888; local10++) {
				@Pc(17) Class33 local17 = this.aClass33Array1[local10];
				this.method559(local17, this.anInt882);
				this.aClass33Array1[local10] = null;
			}
			this.anInt888 = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("77917, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!q;I)V")
	private void method559(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != -1189) {
				this.aBoolean223 = !this.aBoolean223;
			}
			for (@Pc(15) int local15 = arg0.anInt856; local15 <= arg0.anInt857; local15++) {
				for (@Pc(20) int local20 = arg0.anInt858; local20 <= arg0.anInt859; local20++) {
					@Pc(32) Class1_Sub3 local32 = this.aClass1_Sub3ArrayArrayArray1[arg0.anInt851][local15][local20];
					if (local32 != null) {
						@Pc(52) int local52;
						for (@Pc(36) int local36 = 0; local36 < local32.anInt981; local36++) {
							if (local32.aClass33Array3[local36] == arg0) {
								local32.anInt981--;
								for (local52 = local36; local52 < local32.anInt981; local52++) {
									local32.aClass33Array3[local52] = local32.aClass33Array3[local52 + 1];
									local32.anIntArray264[local52] = local32.anIntArray264[local52 + 1];
								}
								local32.aClass33Array3[local32.anInt981] = null;
								break;
							}
						}
						local32.anInt982 = 0;
						for (local52 = 0; local52 < local32.anInt981; local52++) {
							local32.anInt982 |= local32.anIntArray264[local52];
						}
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("78415, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBII)V")
	public void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != -85) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			@Pc(18) Class1_Sub3 local18 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg3][arg1];
			if (local18 != null) {
				@Pc(24) Class16 local24 = local18.aClass16_1;
				if (local24 != null) {
					@Pc(33) int local33 = arg3 * 128 + 64;
					@Pc(39) int local39 = arg1 * 128 + 64;
					local24.anInt640 = local33 + (local24.anInt640 - local33) * arg4 / 16;
					local24.anInt641 = local39 + (local24.anInt641 - local39) * arg4 / 16;
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("62721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIII)V")
	public void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg1][arg0][arg3];
			if (local8 != null) {
				local8.aClass36_1 = null;
				if (arg2 != 0) {
					this.aBoolean221 = !this.aBoolean221;
				}
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("33918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZI)V")
	public void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2) {
				@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3ArrayArrayArray1[arg3][arg0][arg1];
				if (local11 != null) {
					local11.aClass16_1 = null;
				}
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58824, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IIII)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(10) Class1_Sub3 local10 = this.aClass1_Sub3ArrayArrayArray1[arg3][arg2][arg1];
			if (local10 != null) {
				for (@Pc(15) int local15 = 0; local15 < local10.anInt981; local15++) {
					@Pc(22) Class33 local22 = local10.aClass33Array3[local15];
					if ((local22.anInt862 >> 29 & 0x3) == 2 && local22.anInt856 == arg2 && local22.anInt858 == arg1) {
						this.method559(local22, this.anInt882);
						return;
					}
				}
				while (arg0 >= 0) {
					for (@Pc(53) int local53 = 1; local53 > 0; local53++) {
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("35368, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIZI)V")
	public void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg3][arg1];
			if (!arg2) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
			if (local8 != null) {
				local8.aClass20_1 = null;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("57627, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(IIII)Lclient!r;")
	public Class36 method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
			if (arg3 >= 0) {
				throw new NullPointerException();
			}
			return local8 == null ? null : local8.aClass36_1;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("43918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BIII)Lclient!i;")
	public Class16 method567(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg3][arg1][arg2];
			if (arg0 != this.aByte48) {
				this.anInt883 = -150;
			}
			return local8 == null ? null : local8.aClass16_1;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("38203, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BIII)Lclient!q;")
	public Class33 method568(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg3][arg1][arg2];
			if (local8 == null) {
				return null;
			}
			for (@Pc(14) int local14 = 0; local14 < local8.anInt981; local14++) {
				@Pc(21) Class33 local21 = local8.aClass33Array3[local14];
				if ((local21.anInt862 >> 29 & 0x3) == 2 && local21.anInt856 == arg1 && local21.anInt858 == arg2) {
					return local21;
				}
			}
			if (arg0 != 2) {
				throw new NullPointerException();
			}
			return null;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("42643, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZII)Lclient!k;")
	public Class20 method569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (!arg1) {
				this.anInt881 = 491;
			}
			@Pc(13) Class1_Sub3 local13 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg2][arg3];
			return local13 == null || local13.aClass20_1 == null ? null : local13.aClass20_1;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16930, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)I")
	public int method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass36_1 == null ? 0 : local8.aClass36_1.anInt872;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(IIII)I")
	public int method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg1][arg0][arg3];
			if (arg2 < 4 || arg2 > 4) {
				this.anInt881 = 129;
			}
			return local8 == null || local8.aClass16_1 == null ? 0 : local8.aClass16_1.anInt644;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("81053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(III)I")
	public int method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt981; local14++) {
			@Pc(21) Class33 local21 = local8.aClass33Array3[local14];
			if ((local21.anInt862 >> 29 & 0x3) == 2 && local21.anInt856 == arg1 && local21.anInt858 == arg2) {
				return local21.anInt862;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(III)I")
	public int method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass20_1 == null ? 0 : local8.aClass20_1.anInt701;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(IIII)I")
	public int method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass36_1 != null && local8.aClass36_1.anInt872 == arg3) {
			return local8.aClass36_1.aByte47 & 0xFF;
		} else if (local8.aClass16_1 != null && local8.aClass16_1.anInt644 == arg3) {
			return local8.aClass16_1.aByte30 & 0xFF;
		} else if (local8.aClass20_1 != null && local8.aClass20_1.anInt701 == arg3) {
			return local8.aClass20_1.aByte36 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt981; local56++) {
				if (local8.aClass33Array3[local56].anInt862 == arg3) {
					return local8.aClass33Array3[local56].aByte46 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
	public void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(16) int local16 = (int) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
			@Pc(22) int local22 = arg0 * local16 >> 8;
			if (arg1 == -2568) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt884; local28++) {
					for (@Pc(32) int local32 = 0; local32 < this.anInt885; local32++) {
						for (@Pc(36) int local36 = 0; local36 < this.anInt886; local36++) {
							@Pc(47) Class1_Sub3 local47 = this.aClass1_Sub3ArrayArrayArray1[local28][local32][local36];
							if (local47 != null) {
								@Pc(52) Class36 local52 = local47.aClass36_1;
								if (local52 != null && local52.aClass1_Sub1_Sub1_7 != null && local52.aClass1_Sub1_Sub1_7.aClass28Array10 != null) {
									this.method577(local36, local32, local28, (Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_7, 202, 1, 1);
									if (local52.aClass1_Sub1_Sub1_8 != null && local52.aClass1_Sub1_Sub1_8.aClass28Array10 != null) {
										this.method577(local36, local32, local28, (Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_8, 202, 1, 1);
										this.method578((Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_7, (Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_8, 0, 0, 0, false);
										((Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_8).method306(arg2, local22, arg4, arg3, arg5);
									}
									((Class1_Sub1_Sub1_Sub5) local52.aClass1_Sub1_Sub1_7).method306(arg2, local22, arg4, arg3, arg5);
								}
								for (@Pc(122) int local122 = 0; local122 < local47.anInt981; local122++) {
									@Pc(129) Class33 local129 = local47.aClass33Array3[local122];
									if (local129 != null && local129.aClass1_Sub1_Sub1_6 != null && local129.aClass1_Sub1_Sub1_6.aClass28Array10 != null) {
										this.method577(local36, local32, local28, (Class1_Sub1_Sub1_Sub5) local129.aClass1_Sub1_Sub1_6, 202, local129.anInt859 + 1 - local129.anInt858, local129.anInt857 - local129.anInt856 + 1);
										((Class1_Sub1_Sub1_Sub5) local129.aClass1_Sub1_Sub1_6).method306(arg2, local22, arg4, arg3, arg5);
									}
								}
								@Pc(178) Class20 local178 = local47.aClass20_1;
								if (local178 != null && local178.aClass1_Sub1_Sub1_2.aClass28Array10 != null) {
									this.method576((Class1_Sub1_Sub1_Sub5) local178.aClass1_Sub1_Sub1_2, local36, local28, 864, local32);
									((Class1_Sub1_Sub1_Sub5) local178.aClass1_Sub1_Sub1_2).method306(arg2, local22, arg4, arg3, arg5);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("68223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fb;IIII)V")
	private void method576(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) int local3 = 19 / arg3;
			@Pc(18) Class1_Sub3 local18;
			if (arg4 < this.anInt885) {
				local18 = this.aClass1_Sub3ArrayArrayArray1[arg2][arg4 + 1][arg1];
				if (local18 != null && local18.aClass20_1 != null && local18.aClass20_1.aClass1_Sub1_Sub1_2.aClass28Array10 != null) {
					this.method578(arg0, (Class1_Sub1_Sub1_Sub5) local18.aClass20_1.aClass1_Sub1_Sub1_2, 128, 0, 0, true);
				}
			}
			if (arg1 < this.anInt885) {
				local18 = this.aClass1_Sub3ArrayArrayArray1[arg2][arg4][arg1 + 1];
				if (local18 != null && local18.aClass20_1 != null && local18.aClass20_1.aClass1_Sub1_Sub1_2.aClass28Array10 != null) {
					this.method578(arg0, (Class1_Sub1_Sub1_Sub5) local18.aClass20_1.aClass1_Sub1_Sub1_2, 0, 0, 128, true);
				}
			}
			if (arg4 < this.anInt885 && arg1 < this.anInt886) {
				local18 = this.aClass1_Sub3ArrayArrayArray1[arg2][arg4 + 1][arg1 + 1];
				if (local18 != null && local18.aClass20_1 != null && local18.aClass20_1.aClass1_Sub1_Sub1_2.aClass28Array10 != null) {
					this.method578(arg0, (Class1_Sub1_Sub1_Sub5) local18.aClass20_1.aClass1_Sub1_Sub1_2, 128, 0, 128, true);
				}
			}
			if (arg4 < this.anInt885 && arg1 > 0) {
				local18 = this.aClass1_Sub3ArrayArrayArray1[arg2][arg4 + 1][arg1 - 1];
				if (local18 != null && local18.aClass20_1 != null && local18.aClass20_1.aClass1_Sub1_Sub1_2.aClass28Array10 != null) {
					this.method578(arg0, (Class1_Sub1_Sub1_Sub5) local18.aClass20_1.aClass1_Sub1_Sub1_2, 128, 0, -128, true);
					return;
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("97383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIILclient!fb;III)V")
	private void method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(5) int local5 = arg1;
			@Pc(9) int local9 = arg1 + arg6;
			@Pc(13) int local13 = arg0 - 1;
			@Pc(17) int local17 = arg0 + arg5;
			@Pc(21) int local21 = 65 / arg4;
			for (@Pc(23) int local23 = arg2; local23 <= arg2 + 1; local23++) {
				if (local23 != this.anInt884) {
					for (@Pc(31) int local31 = local5; local31 <= local9; local31++) {
						if (local31 >= 0 && local31 < this.anInt885) {
							for (@Pc(42) int local42 = local13; local42 <= local17; local42++) {
								if (local42 >= 0 && local42 < this.anInt886 && (!local3 || local31 >= local9 || local42 >= local17 || local42 < arg0 && local31 != arg1)) {
									@Pc(75) Class1_Sub3 local75 = this.aClass1_Sub3ArrayArrayArray1[local23][local31][local42];
									if (local75 != null) {
										@Pc(169) int local169 = (this.anIntArrayArrayArray4[local23][local31][local42] + this.anIntArrayArrayArray4[local23][local31 + 1][local42] + this.anIntArrayArrayArray4[local23][local31][local42 + 1] + this.anIntArrayArrayArray4[local23][local31 + 1][local42 + 1]) / 4 - (this.anIntArrayArrayArray4[arg2][arg1][arg0] + this.anIntArrayArrayArray4[arg2][arg1 + 1][arg0] + this.anIntArrayArrayArray4[arg2][arg1][arg0 + 1] + this.anIntArrayArrayArray4[arg2][arg1 + 1][arg0 + 1]) / 4;
										@Pc(172) Class36 local172 = local75.aClass36_1;
										if (local172 != null && local172.aClass1_Sub1_Sub1_7 != null && local172.aClass1_Sub1_Sub1_7.aClass28Array10 != null) {
											this.method578(arg3, (Class1_Sub1_Sub1_Sub5) local172.aClass1_Sub1_Sub1_7, (local31 - arg1) * 128 + (1 - arg6) * 64, local169, (local42 - arg0) * 128 + (1 - arg5) * 64, local3);
										}
										if (local172 != null && local172.aClass1_Sub1_Sub1_8 != null && local172.aClass1_Sub1_Sub1_8.aClass28Array10 != null) {
											this.method578(arg3, (Class1_Sub1_Sub1_Sub5) local172.aClass1_Sub1_Sub1_8, (local31 - arg1) * 128 + (1 - arg6) * 64, local169, (local42 - arg0) * 128 + (1 - arg5) * 64, local3);
										}
										for (@Pc(252) int local252 = 0; local252 < local75.anInt981; local252++) {
											@Pc(259) Class33 local259 = local75.aClass33Array3[local252];
											if (local259 != null && local259.aClass1_Sub1_Sub1_6 != null && local259.aClass1_Sub1_Sub1_6.aClass28Array10 != null) {
												@Pc(276) int local276 = local259.anInt857 + 1 - local259.anInt856;
												@Pc(284) int local284 = local259.anInt859 + 1 - local259.anInt858;
												this.method578(arg3, (Class1_Sub1_Sub1_Sub5) local259.aClass1_Sub1_Sub1_6, (local259.anInt856 - arg1) * 128 + (local276 - arg6) * 64, local169, (local259.anInt858 - arg0) * 128 + (local284 - arg5) * 64, local3);
											}
										}
									}
								}
							}
						}
					}
					local5--;
					local3 = false;
				}
			}
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("50946, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fb;Lclient!fb;IIIZ)V")
	private void method578(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt911++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray125;
		@Pc(15) int local15 = arg1.anInt543;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt543; local17++) {
			@Pc(24) Class28 local24 = arg0.aClass28Array10[local17];
			@Pc(29) Class28 local29 = arg0.aClass28Array9[local17];
			if (local29.anInt821 != 0) {
				@Pc(39) int local39 = arg0.anIntArray126[local17] - arg3;
				if (local39 <= arg1.anInt552) {
					@Pc(50) int local50 = arg0.anIntArray125[local17] - arg2;
					if (local50 >= arg1.anInt547 && local50 <= arg1.anInt548) {
						@Pc(66) int local66 = arg0.anIntArray127[local17] - arg4;
						if (local66 >= arg1.anInt550 && local66 <= arg1.anInt549) {
							for (@Pc(77) int local77 = 0; local77 < local15; local77++) {
								@Pc(84) Class28 local84 = arg1.aClass28Array10[local77];
								@Pc(89) Class28 local89 = arg1.aClass28Array9[local77];
								if (local50 == local12[local77] && local66 == arg1.anIntArray127[local77] && local39 == arg1.anIntArray126[local77] && local89.anInt821 != 0) {
									local24.anInt818 += local89.anInt818;
									local24.anInt819 += local89.anInt819;
									local24.anInt820 += local89.anInt820;
									local24.anInt821 += local89.anInt821;
									local84.anInt818 += local29.anInt818;
									local84.anInt819 += local29.anInt819;
									local84.anInt820 += local29.anInt820;
									local84.anInt821 += local29.anInt821;
									local9++;
									this.anIntArray248[local17] = this.anInt911;
									this.anIntArray249[local77] = this.anInt911;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(195) int local195 = 0; local195 < arg0.anInt544; local195++) {
			if (this.anIntArray248[arg0.anIntArray128[local195]] == this.anInt911 && this.anIntArray248[arg0.anIntArray129[local195]] == this.anInt911 && this.anIntArray248[arg0.anIntArray130[local195]] == this.anInt911) {
				arg0.anIntArray134[local195] = -1;
			}
		}
		for (@Pc(239) int local239 = 0; local239 < arg1.anInt544; local239++) {
			if (this.anIntArray249[arg1.anIntArray128[local239]] == this.anInt911 && this.anIntArray249[arg1.anIntArray129[local239]] == this.anInt911 && this.anIntArray249[arg1.anIntArray130[local239]] == this.anInt911) {
				arg1.anIntArray134[local239] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([IIIIII)V")
	public void method579(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class1_Sub3 local10 = this.aClass1_Sub3ArrayArrayArray1[arg3][arg4][arg5];
		if (local10 == null) {
			return;
		}
		@Pc(16) Class30 local16 = local10.aClass30_1;
		@Pc(26) int local26;
		if (local16 != null) {
			@Pc(21) int local21 = local16.anInt840;
			if (local21 != 0) {
				for (local26 = 0; local26 < 4; local26++) {
					arg0[arg1] = local21;
					arg0[arg1 + 1] = local21;
					arg0[arg1 + 2] = local21;
					arg0[arg1 + 3] = local21;
					arg1 += arg2;
				}
			}
			return;
		}
		@Pc(62) Class18 local62 = local10.aClass18_1;
		if (local62 == null) {
			return;
		}
		local26 = local62.anInt667;
		@Pc(71) int local71 = local62.anInt668;
		@Pc(74) int local74 = local62.anInt669;
		@Pc(77) int local77 = local62.anInt670;
		@Pc(82) int[] local82 = this.anIntArrayArray18[local26];
		@Pc(87) int[] local87 = this.anIntArrayArray19[local71];
		@Pc(89) int local89 = 0;
		@Pc(93) int local93;
		if (local74 != 0) {
			for (local93 = 0; local93 < 4; local93++) {
				arg0[arg1] = local82[local87[local89++]] == 0 ? local74 : local77;
				arg0[arg1 + 1] = local82[local87[local89++]] == 0 ? local74 : local77;
				arg0[arg1 + 2] = local82[local87[local89++]] == 0 ? local74 : local77;
				arg0[arg1 + 3] = local82[local87[local89++]] == 0 ? local74 : local77;
				arg1 += arg2;
			}
			return;
		}
		for (local93 = 0; local93 < 4; local93++) {
			if (local82[local87[local89++]] != 0) {
				arg0[arg1] = local77;
			}
			if (local82[local87[local89++]] != 0) {
				arg0[arg1 + 1] = local77;
			}
			if (local82[local87[local89++]] != 0) {
				arg0[arg1 + 2] = local77;
			}
			if (local82[local87[local89++]] != 0) {
				arg0[arg1 + 3] = local77;
			}
			arg1 += arg2;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(III)V")
	public void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			Static28.aBoolean225 = true;
			Static28.anInt905 = arg2;
			Static28.anInt906 = arg1;
			if (arg0 < 0) {
				Static28.anInt907 = -1;
				Static28.anInt908 = -1;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("5603, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII)V")
	public void method583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 >= this.anInt885 * 128) {
				arg0 = this.anInt885 * 128 - 1;
			}
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 >= this.anInt886 * 128) {
				arg1 = this.anInt886 * 128 - 1;
			}
			Static28.anInt891++;
			Static28.anInt901 = Static11.anIntArray158[arg2];
			Static28.anInt902 = Static11.anIntArray159[arg2];
			Static28.anInt903 = Static11.anIntArray158[arg5];
			Static28.anInt904 = Static11.anIntArray159[arg5];
			Static28.aBooleanArrayArray1 = Static28.aBooleanArrayArrayArrayArray1[(arg2 - 128) / 32][arg5 / 64];
			Static28.anInt898 = arg0;
			Static28.anInt899 = arg3;
			Static28.anInt900 = arg1;
			Static28.anInt896 = arg0 / 128;
			Static28.anInt897 = arg1 / 128;
			Static28.anInt890 = arg4;
			Static28.anInt892 = Static28.anInt896 - 25;
			if (Static28.anInt892 < 0) {
				Static28.anInt892 = 0;
			}
			Static28.anInt894 = Static28.anInt897 - 25;
			if (Static28.anInt894 < 0) {
				Static28.anInt894 = 0;
			}
			Static28.anInt893 = Static28.anInt896 + 25;
			if (arg6 != 5) {
				this.anInt882 = 477;
			}
			if (Static28.anInt893 > this.anInt885) {
				Static28.anInt893 = this.anInt885;
			}
			Static28.anInt895 = Static28.anInt897 + 25;
			if (Static28.anInt895 > this.anInt886) {
				Static28.anInt895 = this.anInt886;
			}
			this.method589(9);
			Static28.anInt889 = 0;
			@Pc(148) int local148;
			@Pc(152) int local152;
			for (@Pc(139) int local139 = this.anInt887; local139 < this.anInt884; local139++) {
				@Pc(146) Class1_Sub3[][] local146 = this.aClass1_Sub3ArrayArrayArray1[local139];
				for (local148 = Static28.anInt892; local148 < Static28.anInt893; local148++) {
					for (local152 = Static28.anInt894; local152 < Static28.anInt895; local152++) {
						@Pc(160) Class1_Sub3 local160 = local146[local148][local152];
						if (local160 != null) {
							if (local160.anInt983 <= arg4 && (Static28.aBooleanArrayArray1[local148 + 25 - Static28.anInt896][local152 + 25 - Static28.anInt897] || this.anIntArrayArrayArray4[local139][local148][local152] - arg3 >= 2000)) {
								local160.aBoolean239 = true;
								local160.aBoolean240 = true;
								if (local160.anInt981 > 0) {
									local160.aBoolean241 = true;
								} else {
									local160.aBoolean241 = false;
								}
								Static28.anInt889++;
							} else {
								local160.aBoolean239 = false;
								local160.aBoolean240 = false;
								local160.anInt984 = 0;
							}
						}
					}
				}
			}
			@Pc(259) int local259;
			@Pc(267) int local267;
			@Pc(273) int local273;
			@Pc(277) int local277;
			@Pc(255) int local255;
			for (@Pc(240) int local240 = this.anInt887; local240 < this.anInt884; local240++) {
				@Pc(247) Class1_Sub3[][] local247 = this.aClass1_Sub3ArrayArrayArray1[local240];
				for (local152 = -25; local152 <= 0; local152++) {
					local255 = Static28.anInt896 + local152;
					local259 = Static28.anInt896 - local152;
					if (local255 >= Static28.anInt892 || local259 < Static28.anInt893) {
						for (local267 = -25; local267 <= 0; local267++) {
							local273 = Static28.anInt897 + local267;
							local277 = Static28.anInt897 - local267;
							@Pc(289) Class1_Sub3 local289;
							if (local255 >= Static28.anInt892) {
								if (local273 >= Static28.anInt894) {
									local289 = local247[local255][local273];
									if (local289 != null && local289.aBoolean239) {
										this.method584(local289, true);
									}
								}
								if (local277 < Static28.anInt895) {
									local289 = local247[local255][local277];
									if (local289 != null && local289.aBoolean239) {
										this.method584(local289, true);
									}
								}
							}
							if (local259 < Static28.anInt893) {
								if (local273 >= Static28.anInt894) {
									local289 = local247[local259][local273];
									if (local289 != null && local289.aBoolean239) {
										this.method584(local289, true);
									}
								}
								if (local277 < Static28.anInt895) {
									local289 = local247[local259][local277];
									if (local289 != null && local289.aBoolean239) {
										this.method584(local289, true);
									}
								}
							}
							if (Static28.anInt889 == 0) {
								Static28.aBoolean225 = false;
								return;
							}
						}
					}
				}
			}
			for (local148 = this.anInt887; local148 < this.anInt884; local148++) {
				@Pc(381) Class1_Sub3[][] local381 = this.aClass1_Sub3ArrayArrayArray1[local148];
				for (local255 = -25; local255 <= 0; local255++) {
					local259 = Static28.anInt896 + local255;
					local267 = Static28.anInt896 - local255;
					if (local259 >= Static28.anInt892 || local267 < Static28.anInt893) {
						for (local273 = -25; local273 <= 0; local273++) {
							local277 = Static28.anInt897 + local273;
							@Pc(411) int local411 = Static28.anInt897 - local273;
							@Pc(423) Class1_Sub3 local423;
							if (local259 >= Static28.anInt892) {
								if (local277 >= Static28.anInt894) {
									local423 = local381[local259][local277];
									if (local423 != null && local423.aBoolean239) {
										this.method584(local423, false);
									}
								}
								if (local411 < Static28.anInt895) {
									local423 = local381[local259][local411];
									if (local423 != null && local423.aBoolean239) {
										this.method584(local423, false);
									}
								}
							}
							if (local267 < Static28.anInt893) {
								if (local277 >= Static28.anInt894) {
									local423 = local381[local267][local277];
									if (local423 != null && local423.aBoolean239) {
										this.method584(local423, false);
									}
								}
								if (local411 < Static28.anInt895) {
									local423 = local381[local267][local411];
									if (local423 != null && local423.aBoolean239) {
										this.method584(local423, false);
									}
								}
							}
							if (Static28.anInt889 == 0) {
								Static28.aBoolean225 = false;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(507) RuntimeException local507) {
			signlink.reporterror("86402, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local507.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!w;Z)V")
	private void method584(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		Static28.aClass31_7.method520(arg0);
		while (true) {
			@Pc(8) Class1_Sub3 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub3[][] local31;
			@Pc(49) Class1_Sub3 local49;
			@Pc(253) int local253;
			@Pc(590) int local590;
			@Pc(595) int local595;
			@Pc(600) int local600;
			@Pc(603) int local603;
			@Pc(612) int local612;
			@Pc(954) Class36 local954;
			@Pc(1135) int local1135;
			@Pc(1014) int local1014;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(260) Class33 var12;
										@Pc(625) int var19;
										@Pc(340) int var22;
										@Pc(292) boolean var23;
										@Pc(837) Class1_Sub3 var34;
										while (true) {
											do {
												local8 = (Class1_Sub3) Static28.aClass31_7.method522();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean240);
											local17 = local8.anInt978;
											local20 = local8.anInt979;
											local23 = local8.anInt977;
											local26 = local8.anInt980;
											local31 = this.aClass1_Sub3ArrayArrayArray1[local23];
											if (!local8.aBoolean239) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub3ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean240) {
														continue;
													}
												}
												if (local17 <= Static28.anInt896 && local17 > Static28.anInt892) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean240 && (local49.aBoolean239 || (local8.anInt982 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static28.anInt896 && local17 < Static28.anInt893 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean240 && (local49.aBoolean239 || (local8.anInt982 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static28.anInt897 && local20 > Static28.anInt894) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean240 && (local49.aBoolean239 || (local8.anInt982 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static28.anInt897 && local20 < Static28.anInt895 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean240 && (local49.aBoolean239 || (local8.anInt982 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean239 = false;
											if (local8.aClass1_Sub3_1 != null) {
												local49 = local8.aClass1_Sub3_1;
												if (local49.aClass30_1 == null) {
													if (local49.aClass18_1 != null && !this.method590(0, local17, local20)) {
														this.method586(Static28.anInt904, Static28.anInt903, true, Static28.anInt901, Static28.anInt902, local49.aClass18_1, local17, local20);
													}
												} else if (!this.method590(0, local17, local20)) {
													this.method585(local49.aClass30_1, 0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local17, local20);
												}
												@Pc(227) Class36 local227 = local49.aClass36_1;
												if (local227 != null) {
													local227.aClass1_Sub1_Sub1_7.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local227.anInt868 - Static28.anInt898, local227.anInt867 - Static28.anInt899, local227.anInt869 - Static28.anInt900, local227.anInt872);
												}
												for (local253 = 0; local253 < local49.anInt981; local253++) {
													var12 = local49.aClass33Array3[local253];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub1_6.method315(var12.anInt855, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, var12.anInt853 - Static28.anInt898, var12.anInt852 - Static28.anInt899, var12.anInt854 - Static28.anInt900, var12.anInt862);
													}
												}
											}
											var23 = false;
											if (local8.aClass30_1 == null) {
												if (local8.aClass18_1 != null && !this.method590(local26, local17, local20)) {
													var23 = true;
													this.method586(Static28.anInt904, Static28.anInt903, true, Static28.anInt901, Static28.anInt902, local8.aClass18_1, local17, local20);
												}
											} else if (!this.method590(local26, local17, local20)) {
												var23 = true;
												this.method585(local8.aClass30_1, local26, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local17, local20);
											}
											var22 = 0;
											local253 = 0;
											@Pc(345) Class36 local345 = local8.aClass36_1;
											@Pc(348) Class16 local348 = local8.aClass16_1;
											if (local345 != null || local348 != null) {
												if (Static28.anInt896 == local17) {
													var22++;
												} else if (Static28.anInt896 < local17) {
													var22 += 2;
												}
												if (Static28.anInt897 == local20) {
													var22 += 3;
												} else if (Static28.anInt897 > local20) {
													var22 += 6;
												}
												local253 = Static28.anIntArray240[var22];
												local8.anInt987 = Static28.anIntArray242[var22];
											}
											if (local345 != null) {
												if ((local345.anInt870 & Static28.anIntArray241[var22]) == 0) {
													local8.anInt984 = 0;
												} else if (local345.anInt870 == 16) {
													local8.anInt984 = 3;
													local8.anInt985 = Static28.anIntArray243[var22];
													local8.anInt986 = 3 - local8.anInt985;
												} else if (local345.anInt870 == 32) {
													local8.anInt984 = 6;
													local8.anInt985 = Static28.anIntArray244[var22];
													local8.anInt986 = 6 - local8.anInt985;
												} else if (local345.anInt870 == 64) {
													local8.anInt984 = 12;
													local8.anInt985 = Static28.anIntArray245[var22];
													local8.anInt986 = 12 - local8.anInt985;
												} else {
													local8.anInt984 = 9;
													local8.anInt985 = Static28.anIntArray246[var22];
													local8.anInt986 = 9 - local8.anInt985;
												}
												if ((local345.anInt870 & local253) != 0 && !this.method591(local26, local17, local20, local345.anInt870)) {
													local345.aClass1_Sub1_Sub1_7.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local345.anInt868 - Static28.anInt898, local345.anInt867 - Static28.anInt899, local345.anInt869 - Static28.anInt900, local345.anInt872);
												}
												if ((local345.anInt871 & local253) != 0 && !this.method591(local26, local17, local20, local345.anInt871)) {
													local345.aClass1_Sub1_Sub1_8.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local345.anInt868 - Static28.anInt898, local345.anInt867 - Static28.anInt899, local345.anInt869 - Static28.anInt900, local345.anInt872);
												}
											}
											if (local348 != null && !this.method592(local26, local17, local20, local348.aClass1_Sub1_Sub1_1.anInt566)) {
												if ((local348.anInt642 & local253) != 0) {
													local348.aClass1_Sub1_Sub1_1.method315(local348.anInt643, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local348.anInt640 - Static28.anInt898, local348.anInt639 - Static28.anInt899, local348.anInt641 - Static28.anInt900, local348.anInt644);
												} else if ((local348.anInt642 & 0x300) != 0) {
													local590 = local348.anInt640 - Static28.anInt898;
													local595 = local348.anInt639 - Static28.anInt899;
													local600 = local348.anInt641 - Static28.anInt900;
													local603 = local348.anInt643;
													if (local603 == 1 || local603 == 2) {
														local612 = -local590;
													} else {
														local612 = local590;
													}
													if (local603 == 2 || local603 == 3) {
														var19 = -local600;
													} else {
														var19 = local600;
													}
													@Pc(643) int local643;
													@Pc(649) int local649;
													if ((local348.anInt642 & 0x100) != 0 && var19 < local612) {
														local643 = local590 + Static28.anIntArray235[local603];
														local649 = local600 + Static28.anIntArray236[local603];
														local348.aClass1_Sub1_Sub1_1.method315(local603 * 512 + 256, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local643, local595, local649, local348.anInt644);
													}
													if ((local348.anInt642 & 0x200) != 0 && var19 > local612) {
														local643 = local590 + Static28.anIntArray237[local603];
														local649 = local600 + Static28.anIntArray238[local603];
														local348.aClass1_Sub1_Sub1_1.method315(local603 * 512 + 1280 & 0x7FF, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local643, local595, local649, local348.anInt644);
													}
												}
											}
											if (var23) {
												@Pc(710) Class20 local710 = local8.aClass20_1;
												if (local710 != null) {
													local710.aClass1_Sub1_Sub1_2.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local710.anInt699 - Static28.anInt898, local710.anInt698 - Static28.anInt899, local710.anInt700 - Static28.anInt900, local710.anInt701);
												}
												@Pc(737) Class22 local737 = local8.aClass22_1;
												if (local737 != null && local737.anInt734 == 0) {
													if (local737.aClass1_Sub1_Sub1_4 != null) {
														local737.aClass1_Sub1_Sub1_4.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local737.anInt731 - Static28.anInt898, local737.anInt730 - Static28.anInt899, local737.anInt732 - Static28.anInt900, local737.anInt733);
													}
													if (local737.aClass1_Sub1_Sub1_5 != null) {
														local737.aClass1_Sub1_Sub1_5.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local737.anInt731 - Static28.anInt898, local737.anInt730 - Static28.anInt899, local737.anInt732 - Static28.anInt900, local737.anInt733);
													}
													if (local737.aClass1_Sub1_Sub1_3 != null) {
														local737.aClass1_Sub1_Sub1_3.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local737.anInt731 - Static28.anInt898, local737.anInt730 - Static28.anInt899, local737.anInt732 - Static28.anInt900, local737.anInt733);
													}
												}
											}
											local590 = local8.anInt982;
											if (local590 != 0) {
												if (local17 < Static28.anInt896 && (local590 & 0x4) != 0) {
													var34 = local31[local17 + 1][local20];
													if (var34 != null && var34.aBoolean240) {
														Static28.aClass31_7.method520(var34);
													}
												}
												if (local20 < Static28.anInt897 && (local590 & 0x2) != 0) {
													var34 = local31[local17][local20 + 1];
													if (var34 != null && var34.aBoolean240) {
														Static28.aClass31_7.method520(var34);
													}
												}
												if (local17 > Static28.anInt896 && (local590 & 0x1) != 0) {
													var34 = local31[local17 - 1][local20];
													if (var34 != null && var34.aBoolean240) {
														Static28.aClass31_7.method520(var34);
													}
												}
												if (local20 > Static28.anInt897 && (local590 & 0x8) != 0) {
													var34 = local31[local17][local20 - 1];
													if (var34 != null && var34.aBoolean240) {
														Static28.aClass31_7.method520(var34);
													}
												}
											}
											break;
										}
										if (local8.anInt984 != 0) {
											var23 = true;
											for (var22 = 0; var22 < local8.anInt981; var22++) {
												if (local8.aClass33Array3[var22].anInt861 != Static28.anInt891 && (local8.anIntArray264[var22] & local8.anInt984) == local8.anInt985) {
													var23 = false;
													break;
												}
											}
											if (var23) {
												local954 = local8.aClass36_1;
												if (!this.method591(local26, local17, local20, local954.anInt870)) {
													local954.aClass1_Sub1_Sub1_7.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local954.anInt868 - Static28.anInt898, local954.anInt867 - Static28.anInt899, local954.anInt869 - Static28.anInt900, local954.anInt872);
												}
												local8.anInt984 = 0;
											}
										}
										if (!local8.aBoolean241) {
											break;
										}
										@Pc(993) int local993 = local8.anInt981;
										local8.aBoolean241 = false;
										var22 = 0;
										label556: for (local253 = 0; local253 < local993; local253++) {
											var12 = local8.aClass33Array3[local253];
											if (var12.anInt861 != Static28.anInt891) {
												for (local1014 = var12.anInt856; local1014 <= var12.anInt857; local1014++) {
													for (local590 = var12.anInt858; local590 <= var12.anInt859; local590++) {
														var34 = local31[local1014][local590];
														if (var34.aBoolean239) {
															local8.aBoolean241 = true;
															continue label556;
														}
														if (var34.anInt984 != 0) {
															local600 = 0;
															if (local1014 > var12.anInt856) {
																local600++;
															}
															if (local1014 < var12.anInt857) {
																local600 += 4;
															}
															if (local590 > var12.anInt858) {
																local600 += 8;
															}
															if (local590 < var12.anInt859) {
																local600 += 2;
															}
															if ((local600 & var34.anInt984) == local8.anInt986) {
																local8.aBoolean241 = true;
																continue label556;
															}
														}
													}
												}
												Static28.aClass33Array2[var22++] = var12;
												local590 = Static28.anInt896 - var12.anInt856;
												local595 = var12.anInt857 - Static28.anInt896;
												if (local595 > local590) {
													local590 = local595;
												}
												local600 = Static28.anInt897 - var12.anInt858;
												local603 = var12.anInt859 - Static28.anInt897;
												if (local603 > local600) {
													var12.anInt860 = local590 + local603;
												} else {
													var12.anInt860 = local590 + local600;
												}
											}
										}
										while (var22 > 0) {
											local1135 = -50;
											local1014 = -1;
											@Pc(1145) Class33 local1145;
											for (local590 = 0; local590 < var22; local590++) {
												local1145 = Static28.aClass33Array2[local590];
												if (local1145.anInt861 != Static28.anInt891) {
													if (local1145.anInt860 > local1135) {
														local1135 = local1145.anInt860;
														local1014 = local590;
													} else if (local1145.anInt860 == local1135) {
														local600 = local1145.anInt853 - Static28.anInt898;
														local603 = local1145.anInt854 - Static28.anInt900;
														local612 = Static28.aClass33Array2[local1014].anInt853 - Static28.anInt898;
														var19 = Static28.aClass33Array2[local1014].anInt854 - Static28.anInt900;
														if (local600 * local600 + local603 * local603 > local612 * local612 + var19 * var19) {
															local1014 = local590;
														}
													}
												}
											}
											if (local1014 == -1) {
												break;
											}
											local1145 = Static28.aClass33Array2[local1014];
											local1145.anInt861 = Static28.anInt891;
											if (!this.method593(local26, local1145.anInt856, local1145.anInt857, local1145.anInt858, local1145.anInt859, local1145.aClass1_Sub1_Sub1_6.anInt566)) {
												local1145.aClass1_Sub1_Sub1_6.method315(local1145.anInt855, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local1145.anInt853 - Static28.anInt898, local1145.anInt852 - Static28.anInt899, local1145.anInt854 - Static28.anInt900, local1145.anInt862);
											}
											for (local600 = local1145.anInt856; local600 <= local1145.anInt857; local600++) {
												for (local603 = local1145.anInt858; local603 <= local1145.anInt859; local603++) {
													@Pc(1273) Class1_Sub3 local1273 = local31[local600][local603];
													if (local1273.anInt984 != 0) {
														Static28.aClass31_7.method520(local1273);
													} else if ((local600 != local17 || local603 != local20) && local1273.aBoolean240) {
														Static28.aClass31_7.method520(local1273);
													}
												}
											}
										}
										if (!local8.aBoolean241) {
											break;
										}
									}
								} while (!local8.aBoolean240);
							} while (local8.anInt984 != 0);
							if (local17 > Static28.anInt896 || local17 <= Static28.anInt892) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean240);
						if (local17 < Static28.anInt896 || local17 >= Static28.anInt893 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean240);
					if (local20 > Static28.anInt897 || local20 <= Static28.anInt894) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean240);
				if (local20 < Static28.anInt897 || local20 >= Static28.anInt895 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean240);
			local8.aBoolean240 = false;
			Static28.anInt889--;
			@Pc(1409) Class22 local1409 = local8.aClass22_1;
			if (local1409 != null && local1409.anInt734 != 0) {
				if (local1409.aClass1_Sub1_Sub1_4 != null) {
					local1409.aClass1_Sub1_Sub1_4.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local1409.anInt731 - Static28.anInt898, local1409.anInt730 - Static28.anInt899 - local1409.anInt734, local1409.anInt732 - Static28.anInt900, local1409.anInt733);
				}
				if (local1409.aClass1_Sub1_Sub1_5 != null) {
					local1409.aClass1_Sub1_Sub1_5.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local1409.anInt731 - Static28.anInt898, local1409.anInt730 - Static28.anInt899 - local1409.anInt734, local1409.anInt732 - Static28.anInt900, local1409.anInt733);
				}
				if (local1409.aClass1_Sub1_Sub1_3 != null) {
					local1409.aClass1_Sub1_Sub1_3.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local1409.anInt731 - Static28.anInt898, local1409.anInt730 - Static28.anInt899 - local1409.anInt734, local1409.anInt732 - Static28.anInt900, local1409.anInt733);
				}
			}
			if (local8.anInt987 != 0) {
				@Pc(1504) Class16 local1504 = local8.aClass16_1;
				if (local1504 != null && !this.method592(local26, local17, local20, local1504.aClass1_Sub1_Sub1_1.anInt566)) {
					if ((local1504.anInt642 & local8.anInt987) != 0) {
						local1504.aClass1_Sub1_Sub1_1.method315(local1504.anInt643, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local1504.anInt640 - Static28.anInt898, local1504.anInt639 - Static28.anInt899, local1504.anInt641 - Static28.anInt900, local1504.anInt644);
					} else if ((local1504.anInt642 & 0x300) != 0) {
						local253 = local1504.anInt640 - Static28.anInt898;
						local1135 = local1504.anInt639 - Static28.anInt899;
						local1014 = local1504.anInt641 - Static28.anInt900;
						local590 = local1504.anInt643;
						if (local590 == 1 || local590 == 2) {
							local595 = -local253;
						} else {
							local595 = local253;
						}
						if (local590 == 2 || local590 == 3) {
							local600 = -local1014;
						} else {
							local600 = local1014;
						}
						if ((local1504.anInt642 & 0x100) != 0 && local600 >= local595) {
							local603 = local253 + Static28.anIntArray235[local590];
							local612 = local1014 + Static28.anIntArray236[local590];
							local1504.aClass1_Sub1_Sub1_1.method315(local590 * 512 + 256, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local603, local1135, local612, local1504.anInt644);
						}
						if ((local1504.anInt642 & 0x200) != 0 && local600 <= local595) {
							local603 = local253 + Static28.anIntArray237[local590];
							local612 = local1014 + Static28.anIntArray238[local590];
							local1504.aClass1_Sub1_Sub1_1.method315(local590 * 512 + 1280 & 0x7FF, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local603, local1135, local612, local1504.anInt644);
						}
					}
				}
				local954 = local8.aClass36_1;
				if (local954 != null) {
					if ((local954.anInt871 & local8.anInt987) != 0 && !this.method591(local26, local17, local20, local954.anInt871)) {
						local954.aClass1_Sub1_Sub1_8.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local954.anInt868 - Static28.anInt898, local954.anInt867 - Static28.anInt899, local954.anInt869 - Static28.anInt900, local954.anInt872);
					}
					if ((local954.anInt870 & local8.anInt987) != 0 && !this.method591(local26, local17, local20, local954.anInt870)) {
						local954.aClass1_Sub1_Sub1_7.method315(0, Static28.anInt901, Static28.anInt902, Static28.anInt903, Static28.anInt904, local954.anInt868 - Static28.anInt898, local954.anInt867 - Static28.anInt899, local954.anInt869 - Static28.anInt900, local954.anInt872);
					}
				}
			}
			@Pc(1765) Class1_Sub3 local1765;
			if (local23 < this.anInt884 - 1) {
				local1765 = this.aClass1_Sub3ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1765 != null && local1765.aBoolean240) {
					Static28.aClass31_7.method520(local1765);
				}
			}
			if (local17 < Static28.anInt896) {
				local1765 = local31[local17 + 1][local20];
				if (local1765 != null && local1765.aBoolean240) {
					Static28.aClass31_7.method520(local1765);
				}
			}
			if (local20 < Static28.anInt897) {
				local1765 = local31[local17][local20 + 1];
				if (local1765 != null && local1765.aBoolean240) {
					Static28.aClass31_7.method520(local1765);
				}
			}
			if (local17 > Static28.anInt896) {
				local1765 = local31[local17 - 1][local20];
				if (local1765 != null && local1765.aBoolean240) {
					Static28.aClass31_7.method520(local1765);
				}
			}
			if (local20 > Static28.anInt897) {
				local1765 = local31[local17][local20 - 1];
				if (local1765 != null && local1765.aBoolean240) {
					Static28.aClass31_7.method520(local1765);
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!p;IIIIIII)V")
	private void method585(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8;
		@Pc(9) int local9 = local8 = (arg6 << 7) - Static28.anInt898;
		@Pc(16) int local16;
		@Pc(17) int local17 = local16 = (arg7 << 7) - Static28.anInt900;
		@Pc(22) int local22;
		@Pc(23) int local23 = local22 = local9 + 128;
		@Pc(28) int local28;
		@Pc(29) int local29 = local28 = local17 + 128;
		@Pc(40) int local40 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static28.anInt899;
		@Pc(53) int local53 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static28.anInt899;
		@Pc(68) int local68 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static28.anInt899;
		@Pc(81) int local81 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static28.anInt899;
		@Pc(91) int local91 = local17 * arg4 + local9 * arg5 >> 16;
		@Pc(101) int local101 = local17 * arg5 - local9 * arg4 >> 16;
		@Pc(103) int local103 = local91;
		@Pc(113) int local113 = local40 * arg3 - local101 * arg2 >> 16;
		@Pc(123) int local123 = local40 * arg2 + local101 * arg3 >> 16;
		@Pc(125) int local125 = local113;
		if (local123 < 50) {
			return;
		}
		local91 = local16 * arg4 + local23 * arg5 >> 16;
		@Pc(149) int local149 = local16 * arg5 - local23 * arg4 >> 16;
		local23 = local91;
		local91 = local53 * arg3 - local149 * arg2 >> 16;
		@Pc(171) int local171 = local53 * arg2 + local149 * arg3 >> 16;
		local53 = local91;
		if (local171 < 50) {
			return;
		}
		local91 = local29 * arg4 + local22 * arg5 >> 16;
		local29 = local29 * arg5 - local22 * arg4 >> 16;
		@Pc(199) int local199 = local91;
		local91 = local68 * arg3 - local29 * arg2 >> 16;
		local29 = local68 * arg2 + local29 * arg3 >> 16;
		local68 = local91;
		if (local29 < 50) {
			return;
		}
		local91 = local28 * arg4 + local8 * arg5 >> 16;
		@Pc(245) int local245 = local28 * arg5 - local8 * arg4 >> 16;
		@Pc(247) int local247 = local91;
		local91 = local81 * arg3 - local245 * arg2 >> 16;
		@Pc(267) int local267 = local81 * arg2 + local245 * arg3 >> 16;
		if (local267 < 50) {
			return;
		}
		@Pc(281) int local281 = Static16.anInt661 + (local103 << 9) / local123;
		@Pc(289) int local289 = Static16.anInt662 + (local125 << 9) / local123;
		@Pc(297) int local297 = Static16.anInt661 + (local23 << 9) / local171;
		@Pc(305) int local305 = Static16.anInt662 + (local53 << 9) / local171;
		@Pc(313) int local313 = Static16.anInt661 + (local199 << 9) / local29;
		@Pc(321) int local321 = Static16.anInt662 + (local68 << 9) / local29;
		@Pc(329) int local329 = Static16.anInt661 + (local247 << 9) / local267;
		@Pc(337) int local337 = Static16.anInt662 + (local91 << 9) / local267;
		Static16.anInt660 = 0;
		@Pc(476) int local476;
		if ((local313 - local329) * (local305 - local337) - (local321 - local337) * (local297 - local329) > 0) {
			Static16.aBoolean159 = false;
			if (local313 < 0 || local329 < 0 || local297 < 0 || local313 > Static14.anInt744 || local329 > Static14.anInt744 || local297 > Static14.anInt744) {
				Static16.aBoolean159 = true;
			}
			if (Static28.aBoolean225 && this.method588(Static28.anInt905, Static28.anInt906, local321, local337, local305, local313, local329, local297)) {
				Static28.anInt907 = arg6;
				Static28.anInt908 = arg7;
			}
			if (arg0.anInt839 == -1) {
				if (arg0.anInt837 != 12345678) {
					Static16.method381(local321, local337, local305, local313, local329, local297, arg0.anInt837, arg0.anInt838, arg0.anInt836);
				}
			} else if (Static28.aBoolean224) {
				local476 = Static28.anIntArray247[arg0.anInt839];
				Static16.method381(local321, local337, local305, local313, local329, local297, this.method587(arg0.anInt837, true, local476), this.method587(arg0.anInt838, true, local476), this.method587(arg0.anInt836, true, local476));
			} else if (arg0.aBoolean210) {
				Static16.method385(local321, local337, local305, local313, local329, local297, arg0.anInt837, arg0.anInt838, arg0.anInt836, local103, local23, local247, local125, local53, local91, local123, local171, local267, arg0.anInt839);
			} else {
				Static16.method385(local321, local337, local305, local313, local329, local297, arg0.anInt837, arg0.anInt838, arg0.anInt836, local199, local247, local23, local68, local91, local53, local29, local267, local171, arg0.anInt839);
			}
		}
		if ((local281 - local297) * (local337 - local305) - (local289 - local305) * (local329 - local297) <= 0) {
			return;
		}
		Static16.aBoolean159 = false;
		if (local281 < 0 || local297 < 0 || local329 < 0 || local281 > Static14.anInt744 || local297 > Static14.anInt744 || local329 > Static14.anInt744) {
			Static16.aBoolean159 = true;
		}
		if (Static28.aBoolean225 && this.method588(Static28.anInt905, Static28.anInt906, local289, local305, local337, local281, local297, local329)) {
			Static28.anInt907 = arg6;
			Static28.anInt908 = arg7;
		}
		if (arg0.anInt839 != -1) {
			if (!Static28.aBoolean224) {
				Static16.method385(local289, local305, local337, local281, local297, local329, arg0.anInt835, arg0.anInt836, arg0.anInt838, local103, local23, local247, local125, local53, local91, local123, local171, local267, arg0.anInt839);
				return;
			}
			local476 = Static28.anIntArray247[arg0.anInt839];
			Static16.method381(local289, local305, local337, local281, local297, local329, this.method587(arg0.anInt835, true, local476), this.method587(arg0.anInt836, true, local476), this.method587(arg0.anInt838, true, local476));
		} else if (arg0.anInt835 != 12345678) {
			Static16.method381(local289, local305, local337, local281, local297, local329, arg0.anInt835, arg0.anInt836, arg0.anInt838);
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZIILclient!j;II)V")
	private void method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class18 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg5.anIntArray191.length;
			@Pc(16) int local16;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(40) int local40;
			for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
				local16 = arg5.anIntArray191[local7] - Static28.anInt898;
				local23 = arg5.anIntArray192[local7] - Static28.anInt899;
				local30 = arg5.anIntArray193[local7] - Static28.anInt900;
				local40 = local30 * arg1 + local16 * arg0 >> 16;
				@Pc(50) int local50 = local30 * arg0 - local16 * arg1 >> 16;
				@Pc(62) int local62 = local23 * arg4 - local50 * arg3 >> 16;
				@Pc(72) int local72 = local23 * arg3 + local50 * arg4 >> 16;
				if (local72 < 50) {
					return;
				}
				if (arg5.anIntArray200 != null) {
					Static18.anIntArray203[local7] = local40;
					Static18.anIntArray204[local7] = local62;
					Static18.anIntArray205[local7] = local72;
				}
				Static18.anIntArray201[local7] = Static16.anInt661 + (local40 << 9) / local72;
				Static18.anIntArray202[local7] = Static16.anInt662 + (local62 << 9) / local72;
			}
			Static16.anInt660 = 0;
			if (!arg2) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			local5 = arg5.anIntArray197.length;
			for (local16 = 0; local16 < local5; local16++) {
				local23 = arg5.anIntArray197[local16];
				local30 = arg5.anIntArray198[local16];
				local40 = arg5.anIntArray199[local16];
				@Pc(155) int local155 = Static18.anIntArray201[local23];
				@Pc(159) int local159 = Static18.anIntArray201[local30];
				@Pc(163) int local163 = Static18.anIntArray201[local40];
				@Pc(167) int local167 = Static18.anIntArray202[local23];
				@Pc(171) int local171 = Static18.anIntArray202[local30];
				@Pc(175) int local175 = Static18.anIntArray202[local40];
				if ((local155 - local159) * (local175 - local171) - (local167 - local171) * (local163 - local159) > 0) {
					Static16.aBoolean159 = false;
					if (local155 < 0 || local159 < 0 || local163 < 0 || local155 > Static14.anInt744 || local159 > Static14.anInt744 || local163 > Static14.anInt744) {
						Static16.aBoolean159 = true;
					}
					if (Static28.aBoolean225 && this.method588(Static28.anInt905, Static28.anInt906, local167, local171, local175, local155, local159, local163)) {
						Static28.anInt907 = arg6;
						Static28.anInt908 = arg7;
					}
					if (arg5.anIntArray200 == null || arg5.anIntArray200[local16] == -1) {
						if (arg5.anIntArray194[local16] != 12345678) {
							Static16.method381(local167, local171, local175, local155, local159, local163, arg5.anIntArray194[local16], arg5.anIntArray195[local16], arg5.anIntArray196[local16]);
						}
					} else if (Static28.aBoolean224) {
						@Pc(379) int local379 = Static28.anIntArray247[arg5.anIntArray200[local16]];
						Static16.method381(local167, local171, local175, local155, local159, local163, this.method587(arg5.anIntArray194[local16], true, local379), this.method587(arg5.anIntArray195[local16], true, local379), this.method587(arg5.anIntArray196[local16], true, local379));
					} else if (arg5.aBoolean162) {
						Static16.method385(local167, local171, local175, local155, local159, local163, arg5.anIntArray194[local16], arg5.anIntArray195[local16], arg5.anIntArray196[local16], Static18.anIntArray203[0], Static18.anIntArray203[1], Static18.anIntArray203[3], Static18.anIntArray204[0], Static18.anIntArray204[1], Static18.anIntArray204[3], Static18.anIntArray205[0], Static18.anIntArray205[1], Static18.anIntArray205[3], arg5.anIntArray200[local16]);
					} else {
						Static16.method385(local167, local171, local175, local155, local159, local163, arg5.anIntArray194[local16], arg5.anIntArray195[local16], arg5.anIntArray196[local16], Static18.anIntArray203[local23], Static18.anIntArray203[local30], Static18.anIntArray203[local40], Static18.anIntArray204[local23], Static18.anIntArray204[local30], Static18.anIntArray204[local40], Static18.anIntArray205[local23], Static18.anIntArray205[local30], Static18.anIntArray205[local40], arg5.anIntArray200[local16]);
					}
				}
			}
		} catch (@Pc(416) RuntimeException local416) {
			signlink.reporterror("212, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local416.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)I")
	private int method587(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg1) {
				return this.anInt882;
			}
			@Pc(8) int local8 = 127 - arg0;
			arg0 = local8 * (arg2 & 0x7F) / 160;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg2 & 0xFF80) + arg0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("50194, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	private void method589(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = Static28.anIntArray239[Static28.anInt890];
			@Pc(9) Class26[] local9 = Static28.aClass26ArrayArray1[Static28.anInt890];
			Static28.anInt910 = 0;
			for (@Pc(13) int local13 = 0; local13 < local5; local13++) {
				@Pc(19) Class26 local19 = local9[local13];
				@Pc(30) int local30;
				@Pc(43) int local43;
				@Pc(54) int local54;
				@Pc(84) int local84;
				@Pc(61) boolean local61;
				if (local19.anInt791 == 1) {
					local30 = local19.anInt787 + 25 - Static28.anInt896;
					if (local30 >= 0 && local30 <= 50) {
						local43 = local19.anInt789 + 25 - Static28.anInt897;
						if (local43 < 0) {
							local43 = 0;
						}
						local54 = local19.anInt790 + 25 - Static28.anInt897;
						if (local54 > 50) {
							local54 = 50;
						}
						local61 = false;
						while (local43 <= local54) {
							if (Static28.aBooleanArrayArray1[local30][local43++]) {
								local61 = true;
								break;
							}
						}
						if (local61) {
							local84 = Static28.anInt898 - local19.anInt792;
							if (local84 > 32) {
								local19.anInt798 = 1;
							} else {
								if (local84 >= -32) {
									continue;
								}
								local19.anInt798 = 2;
								local84 = -local84;
							}
							local19.anInt801 = (local19.anInt794 - Static28.anInt900 << 8) / local84;
							local19.anInt802 = (local19.anInt795 - Static28.anInt900 << 8) / local84;
							local19.anInt803 = (local19.anInt796 - Static28.anInt899 << 8) / local84;
							local19.anInt804 = (local19.anInt797 - Static28.anInt899 << 8) / local84;
							Static28.aClass26Array1[Static28.anInt910++] = local19;
						}
					}
				} else if (local19.anInt791 == 2) {
					local30 = local19.anInt789 + 25 - Static28.anInt897;
					if (local30 >= 0 && local30 <= 50) {
						local43 = local19.anInt787 + 25 - Static28.anInt896;
						if (local43 < 0) {
							local43 = 0;
						}
						local54 = local19.anInt788 + 25 - Static28.anInt896;
						if (local54 > 50) {
							local54 = 50;
						}
						local61 = false;
						while (local43 <= local54) {
							if (Static28.aBooleanArrayArray1[local43++][local30]) {
								local61 = true;
								break;
							}
						}
						if (local61) {
							local84 = Static28.anInt900 - local19.anInt794;
							if (local84 > 32) {
								local19.anInt798 = 3;
							} else {
								if (local84 >= -32) {
									continue;
								}
								local19.anInt798 = 4;
								local84 = -local84;
							}
							local19.anInt799 = (local19.anInt792 - Static28.anInt898 << 8) / local84;
							local19.anInt800 = (local19.anInt793 - Static28.anInt898 << 8) / local84;
							local19.anInt803 = (local19.anInt796 - Static28.anInt899 << 8) / local84;
							local19.anInt804 = (local19.anInt797 - Static28.anInt899 << 8) / local84;
							Static28.aClass26Array1[Static28.anInt910++] = local19;
						}
					}
				} else if (local19.anInt791 == 4) {
					local30 = local19.anInt796 - Static28.anInt899;
					if (local30 > 128) {
						local43 = local19.anInt789 + 25 - Static28.anInt897;
						if (local43 < 0) {
							local43 = 0;
						}
						local54 = local19.anInt790 + 25 - Static28.anInt897;
						if (local54 > 50) {
							local54 = 50;
						}
						if (local43 <= local54) {
							@Pc(330) int local330 = local19.anInt787 + 25 - Static28.anInt896;
							if (local330 < 0) {
								local330 = 0;
							}
							local84 = local19.anInt788 + 25 - Static28.anInt896;
							if (local84 > 50) {
								local84 = 50;
							}
							@Pc(348) boolean local348 = false;
							label155: for (@Pc(350) int local350 = local330; local350 <= local84; local350++) {
								for (@Pc(354) int local354 = local43; local354 <= local54; local354++) {
									if (Static28.aBooleanArrayArray1[local350][local354]) {
										local348 = true;
										break label155;
									}
								}
							}
							if (local348) {
								local19.anInt798 = 5;
								local19.anInt799 = (local19.anInt792 - Static28.anInt898 << 8) / local30;
								local19.anInt800 = (local19.anInt793 - Static28.anInt898 << 8) / local30;
								local19.anInt801 = (local19.anInt794 - Static28.anInt900 << 8) / local30;
								local19.anInt802 = (local19.anInt795 - Static28.anInt900 << 8) / local30;
								Static28.aClass26Array1[Static28.anInt910++] = local19;
							}
						}
					}
				}
			}
			if (arg0 != 9) {
				this.aBoolean223 = !this.aBoolean223;
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("94485, " + arg0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(III)Z")
	private boolean method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local8 == -Static28.anInt891) {
			return false;
		} else if (local8 == Static28.anInt891) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method594(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method594(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method594(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method594(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = Static28.anInt891;
				return true;
			} else {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static28.anInt891;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(IIII)Z")
	private boolean method591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method590(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static28.anInt898) {
					if (!this.method594(local11, local26, local15)) {
						return false;
					}
					if (!this.method594(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method594(local11, local30, local15)) {
						return false;
					}
					if (!this.method594(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method594(local11, local34, local15)) {
					return false;
				}
				if (!this.method594(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static28.anInt900) {
					if (!this.method594(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method594(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method594(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method594(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method594(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method594(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static28.anInt898) {
					if (!this.method594(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method594(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method594(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method594(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method594(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method594(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static28.anInt900) {
					if (!this.method594(local11, local26, local15)) {
						return false;
					}
					if (!this.method594(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method594(local11, local30, local15)) {
						return false;
					}
					if (!this.method594(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method594(local11, local34, local15)) {
					return false;
				}
				if (!this.method594(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method594(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method594(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method594(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method594(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method594(local11, local34, local15);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(IIII)Z")
	private boolean method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method590(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method594(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] - arg3, local15 + 1) && this.method594(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method594(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method594(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIIIII)Z")
	private boolean method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19;
		@Pc(23) int local23;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local19 = arg1; local19 <= arg2; local19++) {
				for (local23 = arg3; local23 <= arg4; local23++) {
					if (this.anIntArrayArrayArray5[arg0][local19][local23] == -Static28.anInt891) {
						return false;
					}
				}
			}
			local23 = (arg1 << 7) + 1;
			@Pc(160) int local160 = (arg3 << 7) + 2;
			@Pc(171) int local171 = this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5;
			if (!this.method594(local23, local171, local160)) {
				return false;
			}
			@Pc(185) int local185 = (arg2 << 7) - 1;
			if (!this.method594(local185, local171, local160)) {
				return false;
			}
			@Pc(199) int local199 = (arg4 << 7) - 1;
			if (!this.method594(local23, local171, local199)) {
				return false;
			} else if (this.method594(local185, local171, local199)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method590(arg0, arg1, arg3)) {
			local19 = arg1 << 7;
			local23 = arg3 << 7;
			return this.method594(local19 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5, local23 + 1) && this.method594(local19 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] - arg5, local23 + 1) && this.method594(local19 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] - arg5, local23 + 128 - 1) && this.method594(local19 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] - arg5, local23 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(III)Z")
	private boolean method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static28.anInt910; local1++) {
			@Pc(7) Class26 local7 = Static28.aClass26Array1[local1];
			@Pc(16) int local16;
			@Pc(28) int local28;
			@Pc(38) int local38;
			@Pc(48) int local48;
			@Pc(58) int local58;
			if (local7.anInt798 == 1) {
				local16 = local7.anInt792 - arg0;
				if (local16 > 0) {
					local28 = local7.anInt794 + (local7.anInt801 * local16 >> 8);
					local38 = local7.anInt795 + (local7.anInt802 * local16 >> 8);
					local48 = local7.anInt796 + (local7.anInt803 * local16 >> 8);
					local58 = local7.anInt797 + (local7.anInt804 * local16 >> 8);
					if (arg2 >= local28 && arg2 <= local38 && arg1 >= local48 && arg1 <= local58) {
						return true;
					}
				}
			} else if (local7.anInt798 == 2) {
				local16 = arg0 - local7.anInt792;
				if (local16 > 0) {
					local28 = local7.anInt794 + (local7.anInt801 * local16 >> 8);
					local38 = local7.anInt795 + (local7.anInt802 * local16 >> 8);
					local48 = local7.anInt796 + (local7.anInt803 * local16 >> 8);
					local58 = local7.anInt797 + (local7.anInt804 * local16 >> 8);
					if (arg2 >= local28 && arg2 <= local38 && arg1 >= local48 && arg1 <= local58) {
						return true;
					}
				}
			} else if (local7.anInt798 == 3) {
				local16 = local7.anInt794 - arg2;
				if (local16 > 0) {
					local28 = local7.anInt792 + (local7.anInt799 * local16 >> 8);
					local38 = local7.anInt793 + (local7.anInt800 * local16 >> 8);
					local48 = local7.anInt796 + (local7.anInt803 * local16 >> 8);
					local58 = local7.anInt797 + (local7.anInt804 * local16 >> 8);
					if (arg0 >= local28 && arg0 <= local38 && arg1 >= local48 && arg1 <= local58) {
						return true;
					}
				}
			} else if (local7.anInt798 == 4) {
				local16 = arg2 - local7.anInt794;
				if (local16 > 0) {
					local28 = local7.anInt792 + (local7.anInt799 * local16 >> 8);
					local38 = local7.anInt793 + (local7.anInt800 * local16 >> 8);
					local48 = local7.anInt796 + (local7.anInt803 * local16 >> 8);
					local58 = local7.anInt797 + (local7.anInt804 * local16 >> 8);
					if (arg0 >= local28 && arg0 <= local38 && arg1 >= local48 && arg1 <= local58) {
						return true;
					}
				}
			} else if (local7.anInt798 == 5) {
				local16 = arg1 - local7.anInt796;
				if (local16 > 0) {
					local28 = local7.anInt792 + (local7.anInt799 * local16 >> 8);
					local38 = local7.anInt793 + (local7.anInt800 * local16 >> 8);
					local48 = local7.anInt794 + (local7.anInt801 * local16 >> 8);
					local58 = local7.anInt795 + (local7.anInt802 * local16 >> 8);
					if (arg0 >= local28 && arg0 <= local38 && arg2 >= local48 && arg2 <= local58) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
