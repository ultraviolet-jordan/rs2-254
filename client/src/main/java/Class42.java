import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!t")
public final class Class42 {

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "B")
	private byte aByte52 = 3;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt929 = -83;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!u;")
	private Class44 aClass44_1 = new Class44(1024, -176);

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(0);

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(BI)V")
	public Class42(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != this.aByte52) {
				for (@Pc(34) int local34 = 1; local34 > 0; local34++) {
				}
			}
			this.anInt932 = arg1;
			this.anInt933 = arg1;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("10115, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(J)Lclient!x;")
	public Class1_Sub1 method641(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass44_1.method644(arg0);
		if (local5 == null) {
			this.anInt930++;
		} else {
			this.aClass34_1.method531(local5);
			this.anInt931++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!x;ZJ)V")
	public void method642(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2) {
		try {
			if (this.anInt933 == 0) {
				@Pc(6) Class1_Sub1 local6 = this.aClass34_1.method532();
				local6.method669();
				local6.method515();
				if (local6 == this.aClass1_Sub1_37) {
					local6 = this.aClass34_1.method532();
					local6.method669();
					local6.method515();
				}
			} else {
				this.anInt933--;
			}
			this.aClass44_1.method645(arg2, (byte) 0, arg0);
			this.aClass34_1.method531(arg0);
			if (arg1) {
				this.anInt929 = 448;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("68658, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method643() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method532();
			if (local3 == null) {
				this.anInt933 = this.anInt932;
				return;
			}
			local3.method669();
			local3.method515();
		}
	}
}
