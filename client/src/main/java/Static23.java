import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static23 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private static int anInt808;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method516(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method678("seq.dat", null), (byte) 3);
			anInt808 = local8.get2();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt808];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt808; local18++) {
				if (aClass27Array1[local18] == null) {
					aClass27Array1[local18] = new Class27();
				}
				aClass27Array1[local18].method518(9, local8);
			}
			if (arg0) {
				;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("79983, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}
}
