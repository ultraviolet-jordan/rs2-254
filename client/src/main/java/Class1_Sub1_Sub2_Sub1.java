import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
	public static int[] anIntArray181 = new int[512];

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "[I")
	public static int[] anIntArray182 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
	public static int[] anIntArray183 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
	public static int[] anIntArray184 = new int[2048];

	static {
		for (@Pc(19) int local19 = 1; local19 < 512; local19++) {
			anIntArray181[local19] = 32768 / local19;
		}
		for (@Pc(32) int local32 = 1; local32 < 2048; local32++) {
			anIntArray182[local32] = 65536 / local32;
		}
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			anIntArray183[local45] = (int) (Math.sin((double) local45 * 0.0030679615D) * 65536.0D);
			anIntArray184[local45] = (int) (Math.cos((double) local45 * 0.0030679615D) * 65536.0D);
		}
	}
}
