import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public int anInt753 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				this.aBoolean189 = !this.aBoolean189;
			}
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg1.get1();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						this.anInt753 = arg1.get1();
					} else if (local18 == 2) {
						@Pc(36) int local36 = arg1.get1();
						this.anIntArray221 = new int[local36];
						for (@Pc(42) int local42 = 0; local42 < local36; local42++) {
							this.anIntArray221[local42] = arg1.get2();
						}
					} else if (local18 == 3) {
						this.aBoolean190 = true;
					} else if (local18 >= 40 && local18 < 50) {
						this.anIntArray222[local18 - 40] = arg1.get2();
					} else if (local18 >= 50 && local18 < 60) {
						this.anIntArray223[local18 - 50] = arg1.get2();
					} else if (local18 >= 60 && local18 < 70) {
						this.anIntArray224[local18 - 60] = arg1.get2();
					} else {
						System.out.println("Error unrecognised config code: " + local18);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("29774, " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public boolean method479(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (this.anIntArray221 == null) {
				return true;
			} else {
				@Pc(12) boolean local12 = true;
				for (@Pc(14) int local14 = 0; local14 < this.anIntArray221.length; local14++) {
					if (!Static11.method289(this.anIntArray221[local14])) {
						local12 = false;
					}
				}
				return local12;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78504, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean189 = !this.aBoolean189;
			}
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub1_Sub5[] local21 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray221.length; local23++) {
				local21[local23] = Static11.method288(0, this.anIntArray221[local23]);
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48;
			if (local21.length == 1) {
				local48 = local21[0];
			} else {
				local48 = new Class1_Sub1_Sub1_Sub5(local21, local21.length, -928);
			}
			for (@Pc(60) int local60 = 0; local60 < 6 && this.anIntArray222[local60] != 0; local60++) {
				local48.method302(this.anIntArray222[local60], this.anIntArray223[local60]);
			}
			return local48;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("64902, " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method481(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1 && !Static11.method289(this.anIntArray224[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46684, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method482(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 9) {
				throw new NullPointerException();
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray224[local15] != -1) {
					local11[local13++] = Static11.method288(0, this.anIntArray224[local15]);
				}
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = new Class1_Sub1_Sub1_Sub5(local11, local13, -928);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray222[local46] != 0; local46++) {
				local44.method302(this.anIntArray222[local46], this.anIntArray223[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("44785, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
