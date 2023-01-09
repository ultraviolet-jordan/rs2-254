import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static9 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	private static int anInt516;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	private static int[] anIntArray116;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[Lclient!ec;")
	private static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private static int anInt517;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[Lclient!fb;")
	public static Class1_Sub1_Sub1_Sub5[] aClass1_Sub1_Sub1_Sub5Array1 = new Class1_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!t;")
	public static Class42 aClass42_4 = new Class42((byte) 3, 500);

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!t;")
	public static Class42 aClass42_5 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method256(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_5 = new Class1_Sub1_Sub3(arg0.method678("loc.dat", null), (byte) 3);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("loc.idx", null), (byte) 3);
		anInt516 = local19.get2();
		anIntArray116 = new int[anInt516];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt516; local29++) {
			anIntArray116[local29] = local27;
			local27 += local19.get2();
		}
		aClass9Array1 = new Class9[10];
		for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
			aClass9Array1[local49] = new Class9();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method257(@OriginalArg(0) int arg0) {
		try {
			aClass42_4 = null;
			aClass42_5 = null;
			@Pc(7) int local7 = 44 / arg0;
			anIntArray116 = null;
			aClass9Array1 = null;
			aClass1_Sub1_Sub3_5 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("78287, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!ec;")
	public static Class9 method258(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			if (aClass9Array1[local1].anInt518 == arg0) {
				return aClass9Array1[local1];
			}
		}
		anInt517 = (anInt517 + 1) % 10;
		@Pc(27) Class9 local27 = aClass9Array1[anInt517];
		aClass1_Sub1_Sub3_5.anInt777 = anIntArray116[arg0];
		local27.anInt518 = arg0;
		local27.method259();
		local27.method260(9, aClass1_Sub1_Sub3_5);
		return local27;
	}
}
