import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static12 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt576;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt577;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private static int anInt575 = 6;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "Lclient!t;")
	public static Class42 aClass42_6 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method318(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(arg0.method678("npc.dat", null), (byte) 3);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("npc.idx", null), (byte) 3);
		anInt576 = local19.get2();
		anIntArray165 = new int[anInt576];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt576; local29++) {
			anIntArray165[local29] = local27;
			local27 += local19.get2();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)V")
	public static void method319(@OriginalArg(0) int arg0) {
		try {
			aClass42_6 = null;
			anIntArray165 = null;
			if (arg0 <= 0) {
				anInt575 = -75;
			}
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_8 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("49336, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
	public static Class13 method320(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong25 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt577 = (anInt577 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt577] = new Class13();
		aClass1_Sub1_Sub3_8.anInt777 = anIntArray165[arg0];
		local33.aLong25 = arg0;
		local33.method321(9, aClass1_Sub1_Sub3_8);
		return local33;
	}
}
