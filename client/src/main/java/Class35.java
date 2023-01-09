import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!mb;)V")
	public void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) int local5 = 26 / arg1;
			while (true) {
				@Pc(8) int local8 = arg2.get1();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt864 = arg2.get2();
					this.anInt865 = arg2.get1();
					this.anInt866 = arg2.get1();
				} else if (local8 == 10) {
					this.aString28 = arg2.getString();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("18008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
