import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static27 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Z")
	private static boolean aBoolean215;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private static int anInt875;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[Lclient!rc;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public static int anInt876;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method541(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method678("varp.dat", null), (byte) 3);
			anInt876 = 0;
			anInt875 = local8.get2();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt875];
			}
			if (anIntArray234 == null) {
				anIntArray234 = new int[anInt875];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt875; local25++) {
				if (aClass38Array1[local25] == null) {
					aClass38Array1[local25] = new Class38();
				}
				aClass38Array1[local25].method542(local25, 890, local8);
			}
			if (!arg0) {
				aBoolean215 = !aBoolean215;
			}
			if (local8.anInt777 != local8.aByteArray9.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("86069, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
