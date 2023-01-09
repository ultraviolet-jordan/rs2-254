import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!u")
public final class Class44 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt962 = -22996;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[Lclient!v;")
	private Class1[] aClass1Array1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt963 = arg0;
			if (arg1 >= 0) {
				this.anInt962 = -404;
			}
			this.aClass1Array1 = new Class1[arg0];
			for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
				@Pc(31) Class1 local31 = this.aClass1Array1[local21] = new Class1();
				local31.aClass1_41 = local31;
				local31.aClass1_42 = local31;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("58719, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(J)Lclient!v;")
	public Class1 method644(@OriginalArg(0) long arg0) {
		@Pc(11) Class1 local11 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt963 - 1))];
		for (@Pc(14) Class1 local14 = local11.aClass1_41; local14 != local11; local14 = local14.aClass1_41) {
			if (local14.aLong35 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(JBLclient!v;)V")
	public void method645(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1 arg2) {
		try {
			if (arg2.aClass1_42 != null) {
				arg2.method669();
			}
			@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt963 - 1))];
			arg2.aClass1_42 = local18.aClass1_42;
			if (arg1 != 0) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			arg2.aClass1_41 = local18;
			arg2.aClass1_42.aClass1_41 = arg2;
			arg2.aClass1_41.aClass1_42 = arg2;
			arg2.aLong35 = arg0;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("27530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
