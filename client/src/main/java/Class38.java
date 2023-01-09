import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!rc")
public final class Class38 {

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!mb;)V")
	public void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) int local5;
			if (arg1 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				local5 = arg2.get1();
				if (local5 == 0) {
					return;
				}
				if (local5 == 1) {
					this.anInt877 = arg2.get1();
				} else if (local5 == 2) {
					this.anInt878 = arg2.get1();
				} else if (local5 == 3) {
					this.aBoolean216 = true;
					Static27.anIntArray234[Static27.anInt876++] = arg0;
				} else if (local5 == 4) {
					this.aBoolean217 = false;
				} else if (local5 == 5) {
					this.anInt879 = arg2.get2();
				} else if (local5 == 6) {
					this.aBoolean218 = true;
				} else if (local5 == 7) {
					this.anInt880 = arg2.get4();
				} else if (local5 == 8) {
					this.aBoolean219 = true;
					this.aBoolean220 = true;
				} else if (local5 == 10) {
					this.aString29 = arg2.getString();
				} else if (local5 == 11) {
					this.aBoolean220 = true;
				} else {
					System.out.println("Error unrecognised config code: " + local5);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("78907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}
}
