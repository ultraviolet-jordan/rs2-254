import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static26 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private static boolean aBoolean214;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt863;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method536(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			if (!arg0) {
				aBoolean214 = !aBoolean214;
			}
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(arg1.method678("varbit.dat", null), (byte) 3);
			anInt863 = local16.get2();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt863];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt863; local26++) {
				if (aClass35Array1[local26] == null) {
					aClass35Array1[local26] = new Class35();
				}
				aClass35Array1[local26].method537(local26, 890, local16);
			}
			if (local16.anInt777 != local16.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("14450, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}
}
