import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static25 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt842;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!pc;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!t;")
	public static Class42 aClass42_9 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method528(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class48 arg1) {
		try {
			if (!arg0) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg1.method678("spotanim.dat", null), (byte) 3);
			anInt842 = local19.get2();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt842];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt842; local29++) {
				if (aClass32Array1[local29] == null) {
					aClass32Array1[local29] = new Class32();
				}
				aClass32Array1[local29].anInt843 = local29;
				aClass32Array1[local29].method529(9, local19);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("26654, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}
}
