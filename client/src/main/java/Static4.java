import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static4 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Z")
	private static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public static int anInt198 = 678;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	private static int anInt199 = 6;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "y", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!c", name = "z", descriptor = "[I")
	public static final int[] anIntArray29 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!c", name = "B", descriptor = "I")
	public static int anInt204 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	public static int anInt205 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BB)Z")
	public static boolean method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(9) Class1_Sub1_Sub3 local9 = new Class1_Sub1_Sub3(arg2, (byte) 3);
			if (arg3 != 74) {
				anInt198 = -127;
			}
			@Pc(16) int local16 = -1;
			label57: while (true) {
				@Pc(19) int local19 = local9.getSmart();
				if (local19 == 0) {
					return local3;
				}
				local16 += local19;
				@Pc(27) int local27 = 0;
				@Pc(29) boolean local29 = false;
				while (true) {
					@Pc(34) int local34;
					while (!local29) {
						local34 = local9.getSmart();
						if (local34 == 0) {
							continue label57;
						}
						local27 += local34 - 1;
						@Pc(56) int local56 = local27 & 0x3F;
						@Pc(62) int local62 = local27 >> 6 & 0x3F;
						@Pc(67) int local67 = local9.get1() >> 2;
						@Pc(71) int local71 = local62 + arg1;
						@Pc(75) int local75 = local56 + arg0;
						if (local71 > 0 && local75 > 0 && local71 < 103 && local75 < 103) {
							@Pc(88) Class9 local88 = Static9.method258(local16);
							if (local67 != 22 || !aBoolean33 || local88.aBoolean117 || local88.aBoolean123) {
								local3 &= local88.method262(0);
								local29 = true;
							}
						}
					}
					local34 = local9.getSmart();
					if (local34 == 0) {
						break;
					}
					local9.get1();
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("87069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!mb;Lclient!vb;B)V")
	public static void method60(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class45_Sub1 arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(3) int local3 = -1;
			if (arg2 != -13) {
				aBoolean32 = !aBoolean32;
			}
			while (true) {
				@Pc(15) int local15 = arg0.getSmart();
				if (local15 == 0) {
					return;
				}
				local3 += local15;
				@Pc(24) Class9 local24 = Static9.method258(local3);
				local24.method263(38488, arg1);
				while (true) {
					@Pc(31) int local31 = arg0.getSmart();
					if (local31 == 0) {
						break;
					}
					arg0.get1();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("55015, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
	public static int method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(32) int local32 = method66(arg0 + 45365, arg1 + 91923, 4) + (method66(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method66(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)I")
	private static int method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(23) int local23 = method68(local3, local13);
		@Pc(29) int local29 = method68(local3 + 1, local13);
		@Pc(35) int local35 = method68(local3, local13 + 1);
		@Pc(43) int local43 = method68(local3 + 1, local13 + 1);
		@Pc(49) int local49 = method67(local23, local29, local9, arg2);
		@Pc(55) int local55 = method67(local35, local43, local9, arg2);
		return method67(local49, local55, local19, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)I")
	private static int method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub1_Sub2_Sub1.anIntArray184[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
	private static int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31 = method69(arg0 - 1, arg1 - 1) + method69(arg0 + 1, arg1 - 1) + method69(arg0 - 1, arg1 + 1) + method69(arg0 + 1, arg1 + 1);
		@Pc(55) int local55 = method69(arg0 - 1, arg1) + method69(arg0 + 1, arg1) + method69(arg0, arg1 - 1) + method69(arg0, arg1 + 1);
		@Pc(59) int local59 = method69(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
	private static int method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)I")
	public static int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)Z")
	public static boolean method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 != 23745) {
				aBoolean32 = !aBoolean32;
			}
			@Pc(11) Class9 local11 = Static9.method258(arg0);
			if (arg1 == 11) {
				arg1 = 10;
			}
			if (arg1 >= 5 && arg1 <= 8) {
				arg1 = 4;
			}
			return local11.method261(arg1, true);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("85291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!jc;IIILclient!s;[[[IIII)V")
	public static void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class39 arg6, @OriginalArg(7) int[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(9) int local9 = arg7[arg9][arg1][arg3];
			@Pc(19) int local19 = arg7[arg9][arg1 + 1][arg3];
			if (arg8 == anInt199) {
				@Pc(35) int local35 = arg7[arg9][arg1 + 1][arg3 + 1];
				@Pc(45) int local45 = arg7[arg9][arg1][arg3 + 1];
				@Pc(55) int local55 = local9 + local19 + local35 + local45 >> 2;
				@Pc(58) Class9 local58 = Static9.method258(arg5);
				@Pc(70) int local70 = arg1 + (arg3 << 7) + (arg5 << 14) + 1073741824;
				if (!local58.aBoolean117) {
					local70 += Integer.MIN_VALUE;
				}
				@Pc(84) byte local84 = (byte) ((arg0 << 6) + arg4);
				@Pc(101) Class1_Sub1_Sub1 local101;
				if (arg4 == 22) {
					if (local58.anInt521 == -1) {
						local101 = local58.method264(22, arg0, local9, local19, local35, local45, -1);
					} else {
						local101 = new Class1_Sub1_Sub1_Sub2(22, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
					}
					arg6.method550(local101, arg1, local70, -741, arg10, arg3, local55, local84);
					if (local58.aBoolean115 && local58.aBoolean117) {
						arg2.method417(arg3, arg1, 4);
					}
				} else {
					@Pc(194) int local194;
					if (arg4 == 10 || arg4 == 11) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(10, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(10, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						if (local101 != null) {
							@Pc(181) int local181 = 0;
							if (arg4 == 11) {
								local181 += 256;
							}
							@Pc(197) int local197;
							if (arg0 == 1 || arg0 == 3) {
								local194 = local58.anInt520;
								local197 = local58.anInt519;
							} else {
								local194 = local58.anInt519;
								local197 = local58.anInt520;
							}
							arg6.method554(local84, local194, local55, local101, -38295, local197, local70, arg3, arg1, local181, arg10);
						}
						if (local58.aBoolean115) {
							arg2.method416(local58.aBoolean116, 3, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
						}
					} else if (arg4 >= 12) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(arg4, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method554(local84, 1, local55, local101, -38295, 1, local70, arg3, arg1, 0, arg10);
						if (local58.aBoolean115) {
							arg2.method416(local58.aBoolean116, 3, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
						}
					} else if (arg4 == 0) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(0, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(0, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method552(local101, null, local70, 0, arg3, (byte) 54, local84, arg1, local55, anIntArray27[arg0], arg10);
						if (local58.aBoolean115) {
							arg2.method415(arg1, arg3, 9, arg0, local58.aBoolean116, arg4);
						}
					} else if (arg4 == 1) {
						if (local58.anInt521 == -1) {
							local101 = local58.method264(1, arg0, local9, local19, local35, local45, -1);
						} else {
							local101 = new Class1_Sub1_Sub1_Sub2(1, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
						}
						arg6.method552(local101, null, local70, 0, arg3, (byte) 54, local84, arg1, local55, anIntArray28[arg0], arg10);
						if (local58.aBoolean115) {
							arg2.method415(arg1, arg3, 9, arg0, local58.aBoolean116, arg4);
						}
					} else {
						@Pc(457) Class1_Sub1_Sub1 local457;
						@Pc(431) int local431;
						if (arg4 == 2) {
							local431 = arg0 + 1 & 0x3;
							@Pc(447) Class1_Sub1_Sub1 local447;
							if (local58.anInt521 == -1) {
								local447 = local58.method264(2, arg0 + 4, local9, local19, local35, local45, -1);
								local457 = local58.method264(2, local431, local9, local19, local35, local45, -1);
							} else {
								local447 = new Class1_Sub1_Sub1_Sub2(2, arg0 + 4, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
								local457 = new Class1_Sub1_Sub1_Sub2(2, local431, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method552(local447, local457, local70, anIntArray27[local431], arg3, (byte) 54, local84, arg1, local55, anIntArray27[arg0], arg10);
							if (local58.aBoolean115) {
								arg2.method415(arg1, arg3, 9, arg0, local58.aBoolean116, arg4);
							}
						} else if (arg4 == 3) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(3, arg0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(3, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method552(local101, null, local70, 0, arg3, (byte) 54, local84, arg1, local55, anIntArray28[arg0], arg10);
							if (local58.aBoolean115) {
								arg2.method415(arg1, arg3, 9, arg0, local58.aBoolean116, arg4);
							}
						} else if (arg4 == 9) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(arg4, arg0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(arg4, arg0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method554(local84, 1, local55, local101, -38295, 1, local70, arg3, arg1, 0, arg10);
							if (local58.aBoolean115) {
								arg2.method416(local58.aBoolean116, 3, arg3, arg0, local58.anInt519, local58.anInt520, arg1);
							}
						} else if (arg4 == 4) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(anIntArray27[arg0], 0, local84, local55, arg1, local70, arg0 * 512, arg3, 0, local101, arg10, false);
						} else if (arg4 == 5) {
							local431 = 16;
							local194 = arg6.method570(arg10, arg1, arg3);
							if (local194 > 0) {
								local431 = Static9.method258(local194 >> 14 & 0x7FFF).anInt522;
							}
							if (local58.anInt521 == -1) {
								local457 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local457 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(anIntArray27[arg0], anIntArray29[arg0] * local431, local84, local55, arg1, local70, arg0 * 512, arg3, anIntArray30[arg0] * local431, local457, arg10, false);
						} else if (arg4 == 6) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(256, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg10, false);
						} else if (arg4 == 7) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(512, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg10, false);
						} else if (arg4 == 8) {
							if (local58.anInt521 == -1) {
								local101 = local58.method264(4, 0, local9, local19, local35, local45, -1);
							} else {
								local101 = new Class1_Sub1_Sub1_Sub2(4, 0, local9, arg5, 10550, local35, local45, true, local58.anInt521, local19);
							}
							arg6.method553(768, 0, local84, local55, arg1, local70, arg0, arg3, 0, local101, arg10, false);
						}
					}
				}
			}
		} catch (@Pc(927) RuntimeException local927) {
			signlink.reporterror("52567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local927.toString());
			throw new RuntimeException();
		}
	}
}
