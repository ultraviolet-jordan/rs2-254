import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!c")
public final class Class4 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	private int anInt197 = -48;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private int anInt200 = -62;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "([[[B[[[IIII)V")
	public Class4(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt202 = arg2;
			this.anInt203 = arg4;
			if (arg3 < 2 || arg3 > 2) {
				Static4.anInt198 = 239;
			}
			this.anIntArrayArrayArray1 = arg1;
			this.aByteArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray2 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt202][this.anInt203];
			this.aByteArrayArrayArray5 = new byte[4][this.anInt202][this.anInt203];
			this.anIntArrayArrayArray2 = new int[4][this.anInt202 + 1][this.anInt203 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt202 + 1][this.anInt203 + 1];
			this.anIntArrayArray1 = new int[this.anInt202 + 1][this.anInt203 + 1];
			this.anIntArray22 = new int[this.anInt203];
			this.anIntArray23 = new int[this.anInt203];
			this.anIntArray24 = new int[this.anInt203];
			this.anIntArray25 = new int[this.anInt203];
			this.anIntArray26 = new int[this.anInt203];
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("22153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIII)V")
	public void method57(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7;
			for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg4; local3++) {
				for (local7 = arg2; local7 <= arg2 + arg1; local7++) {
					if (local7 >= 0 && local7 < this.anInt202 && local3 >= 0 && local3 < this.anInt203) {
						this.aByteArrayArrayArray6[0][local7][local3] = 127;
						if (local7 == arg2 && local7 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 - 1][local3];
						}
						if (local7 == arg2 + arg1 && local7 < this.anInt202 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7 + 1][local3];
						}
						if (local3 == arg3 && local3 > 0) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 - 1];
						}
						if (local3 == arg3 + arg4 && local3 < this.anInt203 - 1) {
							this.anIntArrayArrayArray1[0][local7][local3] = this.anIntArrayArrayArray1[0][local7][local3 + 1];
						}
					}
				}
			}
			if (arg0 != 1) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("20612, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[BIII)V")
	public void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg2, (byte) 3);
			@Pc(13) int local13;
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < 64; local13++) {
					for (@Pc(17) int local17 = 0; local17 < 64; local17++) {
						@Pc(23) int local23 = local13 + arg0;
						@Pc(27) int local27 = local17 + arg5;
						@Pc(49) int local49;
						if (local23 >= 0 && local23 < 104 && local27 >= 0 && local27 < 104) {
							this.aByteArrayArrayArray1[local9][local23][local27] = 0;
							while (true) {
								local49 = local7.get1();
								if (local49 == 0) {
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -Static4.method65(local23 + arg1 + 932731, local27 + 556238 + arg3) * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - 240;
									}
									break;
								}
								if (local49 == 1) {
									@Pc(105) int local105 = local7.get1();
									if (local105 == 1) {
										local105 = 0;
									}
									if (local9 == 0) {
										this.anIntArrayArrayArray1[0][local23][local27] = -local105 * 8;
									} else {
										this.anIntArrayArrayArray1[local9][local23][local27] = this.anIntArrayArrayArray1[local9 - 1][local23][local27] - local105 * 8;
									}
									break;
								}
								if (local49 <= 49) {
									this.aByteArrayArrayArray3[local9][local23][local27] = local7.get1Signed();
									this.aByteArrayArrayArray4[local9][local23][local27] = (byte) ((local49 - 2) / 4);
									this.aByteArrayArrayArray5[local9][local23][local27] = (byte) (local49 - 2 & 0x3);
								} else if (local49 <= 81) {
									this.aByteArrayArrayArray1[local9][local23][local27] = (byte) (local49 - 49);
								} else {
									this.aByteArrayArrayArray2[local9][local23][local27] = (byte) (local49 - 81);
								}
							}
						} else {
							while (true) {
								local49 = local7.get1();
								if (local49 == 0) {
									break;
								}
								if (local49 == 1) {
									local7.get1();
									break;
								}
								if (local49 <= 49) {
									local7.get1();
								}
							}
						}
					}
				}
			}
			if (arg4 != 0) {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("25719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!s;I[B[Lclient!jc;B)V")
	public void method61(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class19[] arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(7) Class1_Sub1_Sub3 local7 = new Class1_Sub1_Sub3(arg3, (byte) 3);
			@Pc(9) int local9 = -1;
			if (arg5 == 2) {
				@Pc(14) boolean local14 = false;
			} else {
				this.anInt197 = -35;
			}
			while (true) {
				@Pc(22) int local22 = local7.getSmart();
				if (local22 == 0) {
					return;
				}
				local9 += local22;
				@Pc(30) int local30 = 0;
				while (true) {
					@Pc(33) int local33 = local7.getSmart();
					if (local33 == 0) {
						break;
					}
					local30 += local33 - 1;
					@Pc(45) int local45 = local30 & 0x3F;
					@Pc(51) int local51 = local30 >> 6 & 0x3F;
					@Pc(55) int local55 = local30 >> 12;
					@Pc(58) int local58 = local7.get1();
					@Pc(62) int local62 = local58 >> 2;
					@Pc(66) int local66 = local58 & 0x3;
					@Pc(70) int local70 = local51 + arg2;
					@Pc(74) int local74 = local45 + arg0;
					if (local70 > 0 && local74 > 0 && local70 < 103 && local74 < 103) {
						@Pc(86) int local86 = local55;
						if ((this.aByteArrayArrayArray1[1][local70][local74] & 0x2) == 2) {
							local86 = local55 - 1;
						}
						@Pc(101) Class19 local101 = null;
						if (local86 >= 0) {
							local101 = arg4[local86];
						}
						this.method62(local62, local66, local70, local9, local55, 20, local101, local74, arg1);
					}
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("95130, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!jc;ILclient!s;)V")
	private void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class39 arg8) {
		try {
			if (arg5 > 0) {
				if (Static4.aBoolean33) {
					if ((this.aByteArrayArrayArray1[arg4][arg2][arg7] & 0x10) != 0) {
						return;
					}
					if (this.method64(11519, arg2, arg7, arg4) != Static4.anInt201) {
						return;
					}
				}
				@Pc(36) int local36 = this.anIntArrayArrayArray1[arg4][arg2][arg7];
				@Pc(47) int local47 = this.anIntArrayArrayArray1[arg4][arg2 + 1][arg7];
				@Pc(60) int local60 = this.anIntArrayArrayArray1[arg4][arg2 + 1][arg7 + 1];
				@Pc(71) int local71 = this.anIntArrayArrayArray1[arg4][arg2][arg7 + 1];
				@Pc(81) int local81 = local36 + local47 + local60 + local71 >> 2;
				@Pc(84) Class9 local84 = Static9.method258(arg3);
				@Pc(96) int local96 = arg2 + (arg7 << 7) + (arg3 << 14) + 1073741824;
				if (!local84.aBoolean117) {
					local96 += Integer.MIN_VALUE;
				}
				@Pc(110) byte local110 = (byte) ((arg1 << 6) + arg0);
				@Pc(136) Class1_Sub1_Sub1 local136;
				if (arg0 != 22) {
					@Pc(231) int local231;
					if (arg0 == 10 || arg0 == 11) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(10, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(10, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						if (local136 != null) {
							@Pc(218) int local218 = 0;
							if (arg0 == 11) {
								local218 += 256;
							}
							@Pc(234) int local234;
							if (arg1 == 1 || arg1 == 3) {
								local231 = local84.anInt520;
								local234 = local84.anInt519;
							} else {
								local231 = local84.anInt519;
								local234 = local84.anInt520;
							}
							if (arg8.method554(local110, local231, local81, local136, -38295, local234, local96, arg7, arg2, local218, arg4) && local84.aBoolean122) {
								@Pc(265) Class1_Sub1_Sub1_Sub5 local265;
								if (local136 instanceof Class1_Sub1_Sub1_Sub5) {
									local265 = (Class1_Sub1_Sub1_Sub5) local136;
								} else {
									local265 = local84.method264(10, arg1, local36, local47, local60, local71, -1);
								}
								if (local265 != null) {
									for (@Pc(281) int local281 = 0; local281 <= local231; local281++) {
										for (@Pc(285) int local285 = 0; local285 <= local234; local285++) {
											@Pc(292) int local292 = local265.anInt551 / 4;
											if (local292 > 30) {
												local292 = 30;
											}
											if (local292 > this.aByteArrayArrayArray6[arg4][arg2 + local281][arg7 + local285]) {
												this.aByteArrayArrayArray6[arg4][arg2 + local281][arg7 + local285] = (byte) local292;
											}
										}
									}
								}
							}
						}
						if (local84.aBoolean115 && arg6 != null) {
							arg6.method416(local84.aBoolean116, 3, arg7, arg1, local84.anInt519, local84.anInt520, arg2);
						}
					} else if (arg0 >= 12) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(arg0, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(arg0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg8.method554(local110, 1, local81, local136, -38295, 1, local96, arg7, arg2, 0, arg4);
						if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
							this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x924;
						}
						if (local84.aBoolean115 && arg6 != null) {
							arg6.method416(local84.aBoolean116, 3, arg7, arg1, local84.anInt519, local84.anInt520, arg2);
						}
					} else if (arg0 == 0) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(0, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg8.method552(local136, null, local96, 0, arg7, (byte) 54, local110, arg2, local81, Static4.anIntArray27[arg1], arg4);
						if (arg1 == 0) {
							if (local84.aBoolean122) {
								this.aByteArrayArrayArray6[arg4][arg2][arg7] = 50;
								this.aByteArrayArrayArray6[arg4][arg2][arg7 + 1] = 50;
							}
							if (local84.aBoolean120) {
								this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x249;
							}
						} else if (arg1 == 1) {
							if (local84.aBoolean122) {
								this.aByteArrayArrayArray6[arg4][arg2][arg7 + 1] = 50;
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7 + 1] = 50;
							}
							if (local84.aBoolean120) {
								this.anIntArrayArrayArray2[arg4][arg2][arg7 + 1] |= 0x492;
							}
						} else if (arg1 == 2) {
							if (local84.aBoolean122) {
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7] = 50;
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7 + 1] = 50;
							}
							if (local84.aBoolean120) {
								this.anIntArrayArrayArray2[arg4][arg2 + 1][arg7] |= 0x249;
							}
						} else if (arg1 == 3) {
							if (local84.aBoolean122) {
								this.aByteArrayArrayArray6[arg4][arg2][arg7] = 50;
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7] = 50;
							}
							if (local84.aBoolean120) {
								this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x492;
							}
						}
						if (local84.aBoolean115 && arg6 != null) {
							arg6.method415(arg2, arg7, 9, arg1, local84.aBoolean116, arg0);
						}
						if (local84.anInt522 != 16) {
							arg8.method560(arg4, arg7, (byte) -85, arg2, local84.anInt522);
						}
					} else if (arg0 == 1) {
						if (local84.anInt521 == -1) {
							local136 = local84.method264(1, arg1, local36, local47, local60, local71, -1);
						} else {
							local136 = new Class1_Sub1_Sub1_Sub2(1, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
						}
						arg8.method552(local136, null, local96, 0, arg7, (byte) 54, local110, arg2, local81, Static4.anIntArray28[arg1], arg4);
						if (local84.aBoolean122) {
							if (arg1 == 0) {
								this.aByteArrayArrayArray6[arg4][arg2][arg7 + 1] = 50;
							} else if (arg1 == 1) {
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7 + 1] = 50;
							} else if (arg1 == 2) {
								this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7] = 50;
							} else if (arg1 == 3) {
								this.aByteArrayArrayArray6[arg4][arg2][arg7] = 50;
							}
						}
						if (local84.aBoolean115 && arg6 != null) {
							arg6.method415(arg2, arg7, 9, arg1, local84.aBoolean116, arg0);
						}
					} else {
						@Pc(859) Class1_Sub1_Sub1 local859;
						@Pc(833) int local833;
						if (arg0 == 2) {
							local833 = arg1 + 1 & 0x3;
							@Pc(849) Class1_Sub1_Sub1 local849;
							if (local84.anInt521 == -1) {
								local849 = local84.method264(2, arg1 + 4, local36, local47, local60, local71, -1);
								local859 = local84.method264(2, local833, local36, local47, local60, local71, -1);
							} else {
								local849 = new Class1_Sub1_Sub1_Sub2(2, arg1 + 4, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
								local859 = new Class1_Sub1_Sub1_Sub2(2, local833, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method552(local849, local859, local96, Static4.anIntArray27[local833], arg7, (byte) 54, local110, arg2, local81, Static4.anIntArray27[arg1], arg4);
							if (local84.aBoolean120) {
								if (arg1 == 0) {
									this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x249;
									this.anIntArrayArrayArray2[arg4][arg2][arg7 + 1] |= 0x492;
								} else if (arg1 == 1) {
									this.anIntArrayArrayArray2[arg4][arg2][arg7 + 1] |= 0x492;
									this.anIntArrayArrayArray2[arg4][arg2 + 1][arg7] |= 0x249;
								} else if (arg1 == 2) {
									this.anIntArrayArrayArray2[arg4][arg2 + 1][arg7] |= 0x249;
									this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x492;
								} else if (arg1 == 3) {
									this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x492;
									this.anIntArrayArrayArray2[arg4][arg2][arg7] |= 0x249;
								}
							}
							if (local84.aBoolean115 && arg6 != null) {
								arg6.method415(arg2, arg7, 9, arg1, local84.aBoolean116, arg0);
							}
							if (local84.anInt522 != 16) {
								arg8.method560(arg4, arg7, (byte) -85, arg2, local84.anInt522);
							}
						} else if (arg0 == 3) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(3, arg1, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(3, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method552(local136, null, local96, 0, arg7, (byte) 54, local110, arg2, local81, Static4.anIntArray28[arg1], arg4);
							if (local84.aBoolean122) {
								if (arg1 == 0) {
									this.aByteArrayArrayArray6[arg4][arg2][arg7 + 1] = 50;
								} else if (arg1 == 1) {
									this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7 + 1] = 50;
								} else if (arg1 == 2) {
									this.aByteArrayArrayArray6[arg4][arg2 + 1][arg7] = 50;
								} else if (arg1 == 3) {
									this.aByteArrayArrayArray6[arg4][arg2][arg7] = 50;
								}
							}
							if (local84.aBoolean115 && arg6 != null) {
								arg6.method415(arg2, arg7, 9, arg1, local84.aBoolean116, arg0);
							}
						} else if (arg0 == 9) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(arg0, arg1, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(arg0, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method554(local110, 1, local81, local136, -38295, 1, local96, arg7, arg2, 0, arg4);
							if (local84.aBoolean115 && arg6 != null) {
								arg6.method416(local84.aBoolean116, 3, arg7, arg1, local84.anInt519, local84.anInt520, arg2);
							}
						} else if (arg0 == 4) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method553(Static4.anIntArray27[arg1], 0, local110, local81, arg2, local96, arg1 * 512, arg7, 0, local136, arg4, false);
						} else if (arg0 == 5) {
							local833 = 16;
							local231 = arg8.method570(arg4, arg2, arg7);
							if (local231 > 0) {
								local833 = Static9.method258(local231 >> 14 & 0x7FFF).anInt522;
							}
							if (local84.anInt521 == -1) {
								local859 = local84.method264(4, 0, local36, local47, local60, local71, -1);
							} else {
								local859 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method553(Static4.anIntArray27[arg1], Static4.anIntArray29[arg1] * local833, local110, local81, arg2, local96, arg1 * 512, arg7, Static4.anIntArray30[arg1] * local833, local859, arg4, false);
						} else if (arg0 == 6) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method553(256, 0, local110, local81, arg2, local96, arg1, arg7, 0, local136, arg4, false);
						} else if (arg0 == 7) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method553(512, 0, local110, local81, arg2, local96, arg1, arg7, 0, local136, arg4, false);
						} else if (arg0 == 8) {
							if (local84.anInt521 == -1) {
								local136 = local84.method264(4, 0, local36, local47, local60, local71, -1);
							} else {
								local136 = new Class1_Sub1_Sub1_Sub2(4, 0, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
							}
							arg8.method553(768, 0, local110, local81, arg2, local96, arg1, arg7, 0, local136, arg4, false);
						}
					}
				} else if (!Static4.aBoolean33 || local84.aBoolean117 || local84.aBoolean123) {
					if (local84.anInt521 == -1) {
						local136 = local84.method264(22, arg1, local36, local47, local60, local71, -1);
					} else {
						local136 = new Class1_Sub1_Sub1_Sub2(22, arg1, local36, arg3, 10550, local60, local71, true, local84.anInt521, local47);
					}
					arg8.method550(local136, arg2, local96, -741, arg4, arg7, local81, local110);
					if (local84.aBoolean115 && local84.aBoolean117 && arg6 != null) {
						arg6.method417(arg7, arg2, 4);
					}
				}
			}
		} catch (@Pc(1535) RuntimeException local1535) {
			signlink.reporterror("37996, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1535.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!s;[Lclient!jc;I)V")
	public void method63(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class19[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7;
			@Pc(11) int local11;
			@Pc(27) int local27;
			for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method417(local11, local7, 4);
							}
						}
					}
				}
			}
			Static4.anInt204 += (int) (Math.random() * 5.0D) - 2;
			if (Static4.anInt204 < -8) {
				Static4.anInt204 = -8;
			}
			if (Static4.anInt204 > 8) {
				Static4.anInt204 = 8;
			}
			Static4.anInt205 += (int) (Math.random() * 5.0D) - 2;
			if (Static4.anInt205 < -16) {
				Static4.anInt205 = -16;
			}
			if (Static4.anInt205 > 16) {
				Static4.anInt205 = 16;
			}
			@Pc(133) int local133;
			@Pc(139) int local139;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(169) int local169;
			@Pc(191) int local191;
			@Pc(204) int local204;
			@Pc(210) int local210;
			@Pc(214) int local214;
			@Pc(220) int local220;
			@Pc(236) int local236;
			@Pc(284) int local284;
			for (local7 = 0; local7 < 4; local7++) {
				@Pc(108) byte[][] local108 = this.aByteArrayArrayArray6[local7];
				@Pc(110) byte local110 = 96;
				@Pc(112) short local112 = 768;
				@Pc(114) byte local114 = -50;
				@Pc(116) byte local116 = -10;
				@Pc(118) byte local118 = -50;
				local133 = (int) Math.sqrt((double) (local114 * local114 + local116 * local116 + local118 * local118));
				local139 = local112 * local133 >> 8;
				for (local141 = 1; local141 < this.anInt203 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt202 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = local110 + (local114 * local210 + local116 * local214 + local118 * local220) / local139;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray1[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt203; local145++) {
					this.anIntArray22[local145] = 0;
					this.anIntArray23[local145] = 0;
					this.anIntArray24[local145] = 0;
					this.anIntArray25[local145] = 0;
					this.anIntArray26[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt202 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt203; local191++) {
						local204 = local169 + 5;
						@Pc(419) int local419;
						if (local204 >= 0 && local204 < this.anInt202) {
							local210 = this.aByteArrayArrayArray2[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								@Pc(378) Class21 local378 = Static19.aClass21Array1[local210 - 1];
								this.anIntArray22[local191] += local378.anInt727;
								this.anIntArray23[local191] += local378.anInt725;
								this.anIntArray24[local191] += local378.anInt726;
								this.anIntArray25[local191] += local378.anInt728;
								local419 = this.anIntArray26[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt202) {
							local214 = this.aByteArrayArrayArray2[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								@Pc(451) Class21 local451 = Static19.aClass21Array1[local214 - 1];
								this.anIntArray22[local191] -= local451.anInt727;
								this.anIntArray23[local191] -= local451.anInt725;
								this.anIntArray24[local191] -= local451.anInt726;
								this.anIntArray25[local191] -= local451.anInt728;
								local419 = this.anIntArray26[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt202 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt203 + 5; local284++) {
							@Pc(527) int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt203) {
								local204 += this.anIntArray22[local527];
								local210 += this.anIntArray23[local527];
								local214 += this.anIntArray24[local527];
								local220 += this.anIntArray25[local527];
								local236 += this.anIntArray26[local527];
							}
							@Pc(572) int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt203) {
								local204 -= this.anIntArray22[local572];
								local210 -= this.anIntArray23[local572];
								local214 -= this.anIntArray24[local572];
								local220 -= this.anIntArray25[local572];
								local236 -= this.anIntArray26[local572];
							}
							if (local284 >= 1 && local284 < this.anInt203 - 1 && (!Static4.aBoolean33 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method64(11519, local169, local284, local7) == Static4.anInt201)) {
								@Pc(655) int local655 = this.aByteArrayArrayArray2[local7][local169][local284] & 0xFF;
								@Pc(666) int local666 = this.aByteArrayArrayArray3[local7][local169][local284] & 0xFF;
								if (local655 > 0 || local666 > 0) {
									@Pc(679) int local679 = this.anIntArrayArrayArray1[local7][local169][local284];
									@Pc(690) int local690 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									@Pc(703) int local703 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									@Pc(714) int local714 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									@Pc(721) int local721 = this.anIntArrayArray1[local169][local284];
									@Pc(730) int local730 = this.anIntArrayArray1[local169 + 1][local284];
									@Pc(741) int local741 = this.anIntArrayArray1[local169 + 1][local284 + 1];
									@Pc(750) int local750 = this.anIntArrayArray1[local169][local284 + 1];
									@Pc(752) int local752 = -1;
									@Pc(754) int local754 = -1;
									@Pc(762) int local762;
									@Pc(766) int local766;
									if (local655 > 0) {
										local762 = local204 * 256 / local220;
										local766 = local210 / local236;
										@Pc(770) int local770 = local214 / local236;
										local752 = this.method72(local762, local766, local770);
										@Pc(782) int local782 = local762 + Static4.anInt204 & 0xFF;
										local770 += Static4.anInt205;
										if (local770 < 0) {
											local770 = 0;
										} else if (local770 > 255) {
											local770 = 255;
										}
										local754 = this.method72(local782, local766, local770);
									}
									if (local7 > 0) {
										@Pc(807) boolean local807 = true;
										if (local655 == 0 && this.aByteArrayArrayArray4[local7][local169][local284] != 0) {
											local807 = false;
										}
										if (local666 > 0 && !Static19.aClass21Array1[local666 - 1].aBoolean181) {
											local807 = false;
										}
										if (local807 && local679 == local690 && local679 == local703 && local679 == local714) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local762 = 0;
									if (local752 != -1) {
										local762 = Static16.anIntArray188[Static4.method70(local754, 96)];
									}
									if (local666 == 0) {
										arg0.method549(local7, local169, local284, 0, 0, -1, local679, local690, local703, local714, Static4.method70(local752, local721), Static4.method70(local752, local730), Static4.method70(local752, local741), Static4.method70(local752, local750), 0, 0, 0, 0, local762, 0);
									} else {
										local766 = this.aByteArrayArrayArray4[local7][local169][local284] + 1;
										@Pc(919) byte local919 = this.aByteArrayArrayArray5[local7][local169][local284];
										@Pc(925) Class21 local925 = Static19.aClass21Array1[local666 - 1];
										@Pc(928) int local928 = local925.anInt723;
										@Pc(936) int local936;
										@Pc(934) int local934;
										if (local928 >= 0) {
											local934 = Static16.method376(0, local928);
											local936 = -1;
										} else if (local925.anInt722 == 16711935) {
											local934 = 0;
											local936 = -2;
											local928 = -1;
										} else {
											local936 = this.method72(local925.anInt724, local925.anInt725, local925.anInt726);
											local934 = Static16.anIntArray188[this.method71(local925.anInt729, 96)];
										}
										arg0.method549(local7, local169, local284, local766, local919, local928, local679, local690, local703, local714, Static4.method70(local752, local721), Static4.method70(local752, local730), Static4.method70(local752, local741), Static4.method70(local752, local750), this.method71(local936, local721), this.method71(local936, local730), this.method71(local936, local741), this.method71(local936, local750), local762, local934);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt203 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt202 - 1; local204++) {
						arg0.method548(local7, local204, local191, this.method64(11519, local204, local191, local7));
					}
				}
			}
			arg0.method575(768, -2568, 64, -10, -50, -50);
			for (local11 = 0; local11 < this.anInt202; local11++) {
				for (local27 = 0; local27 < this.anInt203; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg0.method546(6, local27, local11);
					}
				}
			}
			local27 = 1;
			@Pc(1107) int local1107 = 2;
			@Pc(1109) int local1109 = 4;
			for (@Pc(1111) int local1111 = 0; local1111 < 4; local1111++) {
				if (local1111 > 0) {
					local27 <<= 0x3;
					local1107 <<= 0x3;
					local1109 <<= 0x3;
				}
				for (@Pc(1129) int local1129 = 0; local1129 <= local1111; local1129++) {
					for (local133 = 0; local133 <= this.anInt203; local133++) {
						for (local139 = 0; local139 <= this.anInt202; local139++) {
							@Pc(1268) short local1268;
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1129][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt203 && (this.anIntArrayArrayArray2[local1129][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label329: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label329;
										}
									}
									local169--;
								}
								label318: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label318;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local1268 = 240;
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - local1268;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Static28.method547(local139 * 128, -374, 1, local214, local139 * 128, local1111, local220, local141 * 128, local145 * 128 + 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local1107) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1129;
								local191 = local1129;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1129][local141 - 1][local133] & local1107) != 0) {
									local141--;
								}
								while (local145 < this.anInt202 && (this.anIntArrayArrayArray2[local1129][local145 + 1][local133] & local1107) != 0) {
									local145++;
								}
								label382: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1107) == 0) {
											break label382;
										}
									}
									local169--;
								}
								label371: while (local191 < local1111) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1107) == 0) {
											break label371;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local1268 = 240;
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - local1268;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Static28.method547(local141 * 128, -374, 2, local214, local145 * 128 + 128, local1111, local220, local133 * 128, local133 * 128);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1107;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1129][local139][local133] & local1109) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1129][local139][local169 - 1] & local1109) != 0) {
									local169--;
								}
								while (local191 < this.anInt203 && (this.anIntArrayArrayArray2[local1129][local139][local191 + 1] & local1109) != 0) {
									local191++;
								}
								label435: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1129][local141 - 1][local204] & local1109) == 0) {
											break label435;
										}
									}
									local141--;
								}
								label424: while (local145 < this.anInt202) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1129][local145 + 1][local204] & local1109) == 0) {
											break label424;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1129][local141][local169];
									Static28.method547(local141 * 128, -374, 4, local204, local145 * 128 + 128, local1111, local204, local169 * 128, local191 * 128 + 128);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1129][local210][local214] &= ~local1109;
										}
									}
								}
							}
						}
					}
				}
			}
			if (arg2 != 44106) {
				this.anInt200 = 169;
			}
		} catch (@Pc(1750) RuntimeException local1750) {
			signlink.reporterror("80831, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1750.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)I")
	private int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != 11519) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			if ((this.aByteArrayArrayArray1[arg3][arg1][arg2] & 0x8) == 0) {
				return arg3 <= 0 || (this.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
			} else {
				return 0;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("72080, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)I")
	private int method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)I")
	private int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
