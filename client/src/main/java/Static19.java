import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static19 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt721;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method447(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			if (arg0) {
				@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg1.method678("flo.dat", null), (byte) 3);
				anInt721 = local11.get2();
				if (aClass21Array1 == null) {
					aClass21Array1 = new Class21[anInt721];
				}
				for (@Pc(21) int local21 = 0; local21 < anInt721; local21++) {
					if (aClass21Array1[local21] == null) {
						aClass21Array1[local21] = new Class21();
					}
					aClass21Array1[local21].method448(9, local11);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("5479, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}
}
