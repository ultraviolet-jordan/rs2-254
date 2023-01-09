import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("67568, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method81(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(8) int local8;
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				local8 = arg1.get1();
				if (local8 != 0) {
					arg1.anInt777--;
					this.aClass7Array1[local3] = new Class7();
					this.aClass7Array1[local3].method243(9, arg1);
				}
			}
			if (arg0 < 9 || arg0 > 9) {
				for (local8 = 1; local8 > 0; local8++) {
				}
			}
			this.anInt218 = arg1.get2();
			this.anInt219 = arg1.get2();
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("53084, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	public int method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt494 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt494 / 20;
				}
			}
			if (arg0 != 0) {
				Static5.anInt217 = -275;
			}
			if (this.anInt218 < this.anInt219 && this.anInt218 / 20 < local3) {
				local3 = this.anInt218 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass7Array1[local62] != null) {
					this.aClass7Array1[local62].anInt494 -= local3 * 20;
				}
			}
			if (this.anInt218 < this.anInt219) {
				this.anInt218 -= local3 * 20;
				this.anInt219 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("36505, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!mb;")
	public Class1_Sub1_Sub3 method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method84(arg1);
			Static5.aClass1_Sub1_Sub3_1.anInt777 = 0;
			Static5.aClass1_Sub1_Sub3_1.method492(1380533830);
			Static5.aClass1_Sub1_Sub3_1.method493(local3 + 36, (byte) 116);
			Static5.aClass1_Sub1_Sub3_1.method492(1463899717);
			Static5.aClass1_Sub1_Sub3_1.method492(1718449184);
			Static5.aClass1_Sub1_Sub3_1.method493(16, (byte) 116);
			if (arg0 != -10189) {
				Static5.anInt217 = 466;
			}
			Static5.aClass1_Sub1_Sub3_1.method490(1, 1);
			Static5.aClass1_Sub1_Sub3_1.method490(1, 1);
			Static5.aClass1_Sub1_Sub3_1.method493(22050, (byte) 116);
			Static5.aClass1_Sub1_Sub3_1.method493(22050, (byte) 116);
			Static5.aClass1_Sub1_Sub3_1.method490(1, 1);
			Static5.aClass1_Sub1_Sub3_1.method490(8, 1);
			Static5.aClass1_Sub1_Sub3_1.method492(1684108385);
			Static5.aClass1_Sub1_Sub3_1.method493(local3, (byte) 116);
			Static5.aClass1_Sub1_Sub3_1.anInt777 += local3;
			return Static5.aClass1_Sub1_Sub3_1;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("76699, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method84(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt493 + this.aClass7Array1[local5].anInt494 > local3) {
				local3 = this.aClass7Array1[local5].anInt493 + this.aClass7Array1[local5].anInt494;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt218 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt219 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			Static5.aByteArray1[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass7Array1[local106] != null) {
				local123 = this.aClass7Array1[local106].anInt493 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt494 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method241(local123, this.aClass7Array1[local106].anInt493);
				for (local147 = 0; local147 < local123; local147++) {
					Static5.aByteArray1[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				Static5.aByteArray1[local133 + local123] = Static5.aByteArray1[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					Static5.aByteArray1[local147 + local123] = Static5.aByteArray1[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
