import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class32 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public int anInt843;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt850;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt845 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private int[] anIntArray231 = new int[6];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray232 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	public int anInt846 = 128;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt847 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method529(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(14) int local14 = arg1.get1();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						this.anInt844 = arg1.get2();
					} else if (local14 == 2) {
						this.anInt845 = arg1.get2();
						if (Static23.aClass27Array1 != null) {
							this.aClass27_2 = Static23.aClass27Array1[this.anInt845];
						}
					} else if (local14 == 4) {
						this.anInt846 = arg1.get2();
					} else if (local14 == 5) {
						this.anInt847 = arg1.get2();
					} else if (local14 == 6) {
						this.anInt848 = arg1.get2();
					} else if (local14 == 7) {
						this.anInt849 = arg1.get1();
					} else if (local14 == 8) {
						this.anInt850 = arg1.get1();
					} else if (local14 >= 40 && local14 < 50) {
						this.anIntArray231[local14 - 40] = arg1.get2();
					} else if (local14 >= 50 && local14 < 60) {
						this.anIntArray232[local14 - 50] = arg1.get2();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local14);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("69114, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method530() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) Static25.aClass42_9.method641((long) this.anInt843);
		if (local6 != null) {
			return local6;
		}
		local6 = Static11.method288(0, this.anInt844);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray231[0] != 0) {
				local6.method302(this.anIntArray231[local21], this.anIntArray232[local21]);
			}
		}
		Static25.aClass42_9.method642(local6, false, (long) this.anInt843);
		return local6;
	}
}
