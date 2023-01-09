import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static20 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt752;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method477(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method678("idk.dat", null), (byte) 3);
			anInt752 = local8.get2();
			if (arg0) {
				if (aClass23Array1 == null) {
					aClass23Array1 = new Class23[anInt752];
				}
				for (@Pc(21) int local21 = 0; local21 < anInt752; local21++) {
					if (aClass23Array1[local21] == null) {
						aClass23Array1[local21] = new Class23();
					}
					aClass23Array1[local21].method478(9, local8);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25262, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}
}
