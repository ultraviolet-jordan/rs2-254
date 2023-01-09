import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private int anInt574 = 579;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	public long aLong25 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte25 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt578 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt579 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt580 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt581 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt583 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt584 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt587 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt588 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt591 = -1;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt592 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method321(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 9) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.get1();
					if (local11 == 0) {
						return;
					}
					@Pc(20) int local20;
					@Pc(26) int local26;
					if (local11 == 1) {
						local20 = arg1.get1();
						this.anIntArray166 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray166[local26] = arg1.get2();
						}
					} else if (local11 == 2) {
						this.aString25 = arg1.getString();
					} else if (local11 == 3) {
						this.aByteArray5 = arg1.getStringArray((byte) 3);
					} else if (local11 == 12) {
						this.aByte25 = arg1.get1Signed();
					} else if (local11 == 13) {
						this.anInt578 = arg1.get2();
					} else if (local11 == 14) {
						this.anInt579 = arg1.get2();
					} else if (local11 == 17) {
						this.anInt579 = arg1.get2();
						this.anInt580 = arg1.get2();
						this.anInt581 = arg1.get2();
						this.anInt582 = arg1.get2();
					} else if (local11 >= 30 && local11 < 40) {
						if (this.aStringArray9 == null) {
							this.aStringArray9 = new String[5];
						}
						this.aStringArray9[local11 - 30] = arg1.getString();
						if (this.aStringArray9[local11 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray9[local11 - 30] = null;
						}
					} else if (local11 == 40) {
						local20 = arg1.get1();
						this.anIntArray168 = new int[local20];
						this.anIntArray169 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray168[local26] = arg1.get2();
							this.anIntArray169[local26] = arg1.get2();
						}
					} else if (local11 == 60) {
						local20 = arg1.get1();
						this.anIntArray167 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray167[local26] = arg1.get2();
						}
					} else if (local11 == 90) {
						this.anInt583 = arg1.get2();
					} else if (local11 == 91) {
						this.anInt584 = arg1.get2();
					} else if (local11 == 92) {
						this.anInt585 = arg1.get2();
					} else if (local11 == 93) {
						this.aBoolean141 = false;
					} else if (local11 == 95) {
						this.anInt586 = arg1.get2();
					} else if (local11 == 97) {
						this.anInt587 = arg1.get2();
					} else if (local11 == 98) {
						this.anInt588 = arg1.get2();
					} else if (local11 == 99) {
						this.aBoolean142 = true;
					} else if (local11 == 100) {
						this.anInt589 = arg1.get1Signed();
					} else if (local11 == 101) {
						this.anInt590 = arg1.get1Signed() * 5;
					} else if (local11 == 102) {
						this.anInt591 = arg1.get2();
					} else if (local11 == 103) {
						this.anInt592 = arg1.get2();
					}
				}
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("84138, " + arg0 + ", " + arg1 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(II[II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) Static12.aClass42_6.method641(this.aLong25);
			if (local7 == null) {
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < this.anIntArray166.length; local13++) {
					if (!Static11.method289(this.anIntArray166[local13])) {
						local11 = true;
					}
				}
				if (local11) {
					return null;
				}
				@Pc(38) Class1_Sub1_Sub1_Sub5[] local38 = new Class1_Sub1_Sub1_Sub5[this.anIntArray166.length];
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray166.length; local40++) {
					local38[local40] = Static11.method288(0, this.anIntArray166[local40]);
				}
				if (local38.length == 1) {
					local7 = local38[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(local38, local38.length, -928);
				}
				if (this.anIntArray168 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray168.length; local80++) {
						local7.method302(this.anIntArray168[local80], this.anIntArray169[local80]);
					}
				}
				local7.method295((byte) 112);
				local7.method305(this.anInt589 + 64, this.anInt590 + 850, -30, -50, -30, true);
				Static12.aClass42_6.method642(local7, false, this.aLong25);
			}
			@Pc(123) Class1_Sub1_Sub1_Sub5 local123 = Static11.aClass1_Sub1_Sub1_Sub5_2;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			local123.method290(Static13.method328((byte) 8, arg1) & Static13.method328((byte) 8, arg3), 764, local7);
			if (arg1 != -1 && arg3 != -1) {
				local123.method297(arg2, -620, arg1, arg3);
			} else if (arg1 != -1) {
				local123.method296(true, arg1);
			}
			if (this.anInt587 != 128 || this.anInt588 != 128) {
				local123.method304(792, this.anInt587, this.anInt587, this.anInt588);
			}
			local123.method292(-15382);
			local123.anIntArrayArray8 = null;
			local123.anIntArrayArray7 = null;
			if (this.aByte25 == 1) {
				local123.aBoolean133 = true;
			}
			return local123;
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("48029, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method323(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 21159) {
				this.anInt574 = -37;
			}
			if (this.anIntArray167 == null) {
				return null;
			}
			@Pc(14) boolean local14 = false;
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray167.length; local16++) {
				if (!Static11.method289(this.anIntArray167[local16])) {
					local14 = true;
				}
			}
			if (local14) {
				return null;
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5[] local41 = new Class1_Sub1_Sub1_Sub5[this.anIntArray167.length];
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray167.length; local43++) {
				local41[local43] = Static11.method288(0, this.anIntArray167[local43]);
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5 local68;
			if (local41.length == 1) {
				local68 = local41[0];
			} else {
				local68 = new Class1_Sub1_Sub1_Sub5(local41, local41.length, -928);
			}
			if (this.anIntArray168 != null) {
				for (@Pc(83) int local83 = 0; local83 < this.anIntArray168.length; local83++) {
					local68.method302(this.anIntArray168[local83], this.anIntArray169[local83]);
				}
			}
			return local68;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("75086, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
