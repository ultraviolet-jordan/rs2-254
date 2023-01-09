import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
	public Class31(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt841 = -32;
			}
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("60928, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;)V")
	public void method520(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method669();
		}
		arg0.aClass1_42 = this.aClass1_39.aClass1_42;
		arg0.aClass1_41 = this.aClass1_39;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;I)V")
	public void method521(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method669();
			}
			arg0.aClass1_42 = this.aClass1_39;
			arg0.aClass1_41 = this.aClass1_39.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			while (arg1 >= 0) {
				this.aBoolean211 = !this.aBoolean211;
			}
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("21977, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!v;")
	public Class1 method522() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method669();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!v;")
	public Class1 method523() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			this.aClass1_40 = null;
			return null;
		} else {
			this.aClass1_40 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!v;")
	public Class1 method524(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 2) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			@Pc(13) Class1 local13 = this.aClass1_39.aClass1_42;
			if (local13 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("17160, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
	public Class1 method525(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			}
			this.aClass1_40 = local2.aClass1_41;
			if (arg0 != 6) {
				this.aBoolean211 = !this.aBoolean211;
			}
			return local2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93799, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!v;")
	public Class1 method526(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (arg0 != 0) {
				this.anInt841 = -273;
			}
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("8210, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
	public void method527() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
			if (local3 == this.aClass1_39) {
				return;
			}
			local3.method669();
		}
	}
}
