import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static5 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public static int anInt217;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[B")
	public static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[I")
	public static int[] anIntArray31 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!mb;)V")
	public static void method79(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, (byte) 3);
			Static8.method240();
			if (!arg0) {
				anInt217 = 84;
			}
			while (true) {
				@Pc(16) int local16 = arg1.get2();
				if (local16 == 65535) {
					return;
				}
				aClass5Array1[local16] = new Class5(0);
				aClass5Array1[local16].method81(9, arg1);
				anIntArray31[local16] = aClass5Array1[local16].method82(0);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("25959, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)Lclient!mb;")
	public static Class1_Sub1_Sub3 method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != -74) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(17) Class5 local17 = aClass5Array1[arg1];
				return local17.method83(-10189, arg0);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("29844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
