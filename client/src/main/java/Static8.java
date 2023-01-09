import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
	public static int[] anIntArray111 = new int[5];

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	public static int[] anIntArray112 = new int[5];

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	public static int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
	public static int[] anIntArray114 = new int[5];

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "[I")
	public static int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method240() {
		anIntArray109 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray109[local6] = 1;
			} else {
				anIntArray109[local6] = -1;
			}
		}
		anIntArray110 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray110[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray108 = new int[220500];
	}
}
