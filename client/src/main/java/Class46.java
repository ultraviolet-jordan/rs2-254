import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!wb")
public final class Class46 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	private int anInt989 = 65000;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile1;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile aRandomAccessFile2;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/io/RandomAccessFile;IIILjava/io/RandomAccessFile;)V")
	public Class46(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) RandomAccessFile arg4) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			this.anInt988 = arg3;
			this.aRandomAccessFile1 = arg4;
			this.aRandomAccessFile2 = arg0;
			this.anInt989 = arg2;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("14651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)[B")
	public synchronized byte[] method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6;
			if (arg0 != 9) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			try {
				this.method673(this.aRandomAccessFile2, arg1 * 6, 0);
				@Pc(32) int local32;
				for (local6 = 0; local6 < 6; local6 += local32) {
					local32 = this.aRandomAccessFile2.read(Static33.aByteArray20, local6, 6 - local6);
					if (local32 == -1) {
						return null;
					}
				}
				local32 = ((Static33.aByteArray20[0] & 0xFF) << 16) + ((Static33.aByteArray20[1] & 0xFF) << 8) + (Static33.aByteArray20[2] & 0xFF);
				@Pc(88) int local88 = ((Static33.aByteArray20[3] & 0xFF) << 16) + ((Static33.aByteArray20[4] & 0xFF) << 8) + (Static33.aByteArray20[5] & 0xFF);
				if (local32 < 0 || local32 > this.anInt989) {
					return null;
				} else if (local88 > 0 && (long) local88 <= this.aRandomAccessFile1.length() / 520L) {
					@Pc(112) byte[] local112 = new byte[local32];
					@Pc(114) int local114 = 0;
					@Pc(116) int local116 = 0;
					while (local114 < local32) {
						if (local88 == 0) {
							return null;
						}
						this.method673(this.aRandomAccessFile1, local88 * 520, 0);
						local6 = 0;
						@Pc(136) int local136 = local32 - local114;
						if (local136 > 512) {
							local136 = 512;
						}
						@Pc(154) int local154;
						while (local6 < local136 + 8) {
							local154 = this.aRandomAccessFile1.read(Static33.aByteArray20, local6, local136 + 8 - local6);
							if (local154 == -1) {
								return null;
							}
							local6 += local154;
						}
						local154 = ((Static33.aByteArray20[0] & 0xFF) << 8) + (Static33.aByteArray20[1] & 0xFF);
						@Pc(196) int local196 = ((Static33.aByteArray20[2] & 0xFF) << 8) + (Static33.aByteArray20[3] & 0xFF);
						@Pc(218) int local218 = ((Static33.aByteArray20[4] & 0xFF) << 16) + ((Static33.aByteArray20[5] & 0xFF) << 8) + (Static33.aByteArray20[6] & 0xFF);
						@Pc(224) int local224 = Static33.aByteArray20[7] & 0xFF;
						if (local154 == arg1 && local196 == local116 && local224 == this.anInt988) {
							if (local218 >= 0 && (long) local218 <= this.aRandomAccessFile1.length() / 520L) {
								for (@Pc(251) int local251 = 0; local251 < local136; local251++) {
									local112[local114++] = Static33.aByteArray20[local251 + 8];
								}
								local88 = local218;
								local116++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local112;
				} else {
					return null;
				}
			} catch (@Pc(275) IOException local275) {
				return null;
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("47611, " + arg0 + ", " + arg1 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BZ)Z")
	public synchronized boolean method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg3) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			@Pc(16) boolean local16 = this.method672(arg2, arg1, arg0, (byte) -45, true);
			if (!local16) {
				local16 = this.method672(arg2, arg1, arg0, (byte) -45, false);
			}
			return local16;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("14977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BIIBZ)Z")
	private synchronized boolean method672(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) boolean arg4) {
		try {
			if (arg3 != -45) {
				this.aBoolean242 = !this.aBoolean242;
			}
			try {
				@Pc(69) int local69;
				@Pc(24) int local24;
				@Pc(35) int local35;
				if (arg4) {
					this.method673(this.aRandomAccessFile2, arg1 * 6, 0);
					for (local24 = 0; local24 < 6; local24 += local35) {
						local35 = this.aRandomAccessFile2.read(Static33.aByteArray20, local24, 6 - local24);
						if (local35 == -1) {
							return false;
						}
					}
					local69 = ((Static33.aByteArray20[3] & 0xFF) << 16) + ((Static33.aByteArray20[4] & 0xFF) << 8) + (Static33.aByteArray20[5] & 0xFF);
					if (local69 <= 0 || (long) local69 > this.aRandomAccessFile1.length() / 520L) {
						return false;
					}
				} else {
					local69 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local69 == 0) {
						local69 = 1;
					}
				}
				Static33.aByteArray20[0] = (byte) (arg2 >> 16);
				Static33.aByteArray20[1] = (byte) (arg2 >> 8);
				Static33.aByteArray20[2] = (byte) arg2;
				Static33.aByteArray20[3] = (byte) (local69 >> 16);
				Static33.aByteArray20[4] = (byte) (local69 >> 8);
				Static33.aByteArray20[5] = (byte) local69;
				this.method673(this.aRandomAccessFile2, arg1 * 6, 0);
				this.aRandomAccessFile2.write(Static33.aByteArray20, 0, 6);
				local24 = 0;
				local35 = 0;
				while (local24 < arg2) {
					@Pc(155) int local155 = 0;
					@Pc(167) int local167;
					if (arg4) {
						this.method673(this.aRandomAccessFile1, local69 * 520, 0);
						@Pc(178) int local178;
						for (local167 = 0; local167 < 8; local167 += local178) {
							local178 = this.aRandomAccessFile1.read(Static33.aByteArray20, local167, 8 - local167);
							if (local178 == -1) {
								break;
							}
						}
						if (local167 == 8) {
							local178 = ((Static33.aByteArray20[0] & 0xFF) << 8) + (Static33.aByteArray20[1] & 0xFF);
							@Pc(219) int local219 = ((Static33.aByteArray20[2] & 0xFF) << 8) + (Static33.aByteArray20[3] & 0xFF);
							local155 = ((Static33.aByteArray20[4] & 0xFF) << 16) + ((Static33.aByteArray20[5] & 0xFF) << 8) + (Static33.aByteArray20[6] & 0xFF);
							@Pc(247) int local247 = Static33.aByteArray20[7] & 0xFF;
							if (local178 != arg1 || local219 != local35 || local247 != this.anInt988) {
								return false;
							}
							if (local155 < 0 || (long) local155 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local155 == 0) {
						arg4 = false;
						local155 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local155 == 0) {
							local155++;
						}
						if (local155 == local69) {
							local155++;
						}
					}
					if (arg2 - local24 <= 512) {
						local155 = 0;
					}
					Static33.aByteArray20[0] = (byte) (arg1 >> 8);
					Static33.aByteArray20[1] = (byte) arg1;
					Static33.aByteArray20[2] = (byte) (local35 >> 8);
					Static33.aByteArray20[3] = (byte) local35;
					Static33.aByteArray20[4] = (byte) (local155 >> 16);
					Static33.aByteArray20[5] = (byte) (local155 >> 8);
					Static33.aByteArray20[6] = (byte) local155;
					Static33.aByteArray20[7] = (byte) this.anInt988;
					this.method673(this.aRandomAccessFile1, local69 * 520, 0);
					this.aRandomAccessFile1.write(Static33.aByteArray20, 0, 8);
					local167 = arg2 - local24;
					if (local167 > 512) {
						local167 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local24, local167);
					local24 += local167;
					local69 = local155;
					local35++;
				}
				return true;
			} catch (@Pc(390) IOException local390) {
				return false;
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("90571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
	private synchronized void method673(@OriginalArg(0) RandomAccessFile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg2 == 0) {
				if (arg1 < 0 || arg1 > 62914560) {
					System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
					arg1 = 62914560;
					try {
						Thread.sleep(1000L);
					} catch (@Pc(27) Exception local27) {
					}
				}
				arg0.seek((long) arg1);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("49310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}
