import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static21 {

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "B")
	private static byte aByte42 = 73;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!pb;")
	public static Class31 aClass31_4 = new Class31(false);

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!pb;")
	public static Class31 aClass31_5 = new Class31(false);

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!pb;")
	public static Class31 aClass31_6 = new Class31(false);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!mb;")
	public static Class1_Sub1_Sub3 method485(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (arg0 == 0 && anInt779 > 0) {
					anInt779--;
					local7 = (Class1_Sub1_Sub3) aClass31_4.method522();
				} else if (arg0 == 1 && anInt780 > 0) {
					anInt780--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method522();
				} else if (arg0 == 2 && anInt781 > 0) {
					anInt781--;
					local7 = (Class1_Sub1_Sub3) aClass31_6.method522();
				}
				if (local7 != null) {
					local7.anInt777 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(0);
			local69.anInt777 = 0;
			if (arg1 != aByte42) {
				for (@Pc(77) int local77 = 1; local77 > 0; local77++) {
				}
			}
			if (arg0 == 0) {
				local69.aByteArray9 = new byte[100];
			} else if (arg0 == 1) {
				local69.aByteArray9 = new byte[5000];
			} else {
				local69.aByteArray9 = new byte[30000];
			}
			return local69;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("8720, " + arg0 + ", " + arg1 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}
}
