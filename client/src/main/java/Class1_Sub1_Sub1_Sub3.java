import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class15 local3 = Static15.method345(this.anInt487);
			if (arg0 != 45160) {
				throw new NullPointerException();
			}
			return local3.method349(this.anInt488);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("69139, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
