import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!eb")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private int anInt501 = 9;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!pc;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass32_1 = Static25.aClass32Array1[arg1];
			this.anInt502 = arg0;
			if (arg9 != 0) {
				throw new NullPointerException();
			}
			this.anInt503 = arg6;
			this.anInt504 = arg10;
			this.anInt505 = arg4;
			this.anInt507 = arg2;
			this.anInt508 = arg3;
			this.anInt509 = arg7;
			this.anInt510 = arg11;
			this.anInt511 = arg8;
			this.anInt506 = arg5;
			this.aBoolean113 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("94350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBII)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean113) {
				local8 = arg3 - this.anInt503;
				@Pc(14) double local14 = (double) (arg0 - this.anInt504);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt503 + local8 * (double) this.anInt510 / local23;
				this.aDouble2 = (double) this.anInt504 + local14 * (double) this.anInt510 / local23;
				this.aDouble3 = this.anInt505;
			}
			local8 = this.anInt508 + 1 - arg4;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean113) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt509 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
			if (arg2 != 0) {
				this.anInt501 = 68;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("80704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean113 = true;
			this.aDouble1 += this.aDouble4 * (double) arg1;
			this.aDouble2 += this.aDouble5 * (double) arg1;
			this.aDouble3 += this.aDouble7 * (double) arg1 + this.aDouble8 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble7 += this.aDouble8 * (double) arg1;
			if (arg0 >= 0) {
				this.aBoolean112 = !this.aBoolean112;
			}
			this.anInt512 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt513 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass32_1.aClass27_2 != null) {
				this.anInt515 += arg1;
				while (this.anInt515 > this.aClass32_1.aClass27_2.method517((byte) -103, this.anInt514)) {
					this.anInt515 -= this.aClass32_1.aClass27_2.method517((byte) -103, this.anInt514) + 1;
					this.anInt514++;
					if (this.anInt514 >= this.aClass32_1.aClass27_2.anInt809) {
						this.anInt514 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("94807, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_1.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass32_1.aClass27_2 != null) {
				local9 = this.aClass32_1.aClass27_2.anIntArray227[this.anInt514];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(Static13.method328((byte) 8, local9), 992, false, true, local3);
			if (arg0 != 45160) {
				for (@Pc(37) int local37 = 1; local37 > 0; local37++) {
				}
			}
			if (local9 != -1) {
				local32.method295((byte) 112);
				local32.method296(true, local9);
				local32.anIntArrayArray8 = null;
				local32.anIntArrayArray7 = null;
			}
			if (this.aClass32_1.anInt846 != 128 || this.aClass32_1.anInt847 != 128) {
				local32.method304(792, this.aClass32_1.anInt846, this.aClass32_1.anInt846, this.aClass32_1.anInt847);
			}
			local32.method300((byte) 24, this.anInt513);
			local32.method305(this.aClass32_1.anInt849 + 64, this.aClass32_1.anInt850 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("24348, " + arg0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
