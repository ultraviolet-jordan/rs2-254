import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!bc;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!bc;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!bc;")
	private Class3 aClass3_3;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!bc;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!bc;")
	private Class3 aClass3_5;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!bc;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!bc;")
	private Class3 aClass3_7;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!bc;")
	private Class3 aClass3_8;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private int anInt489 = 9;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	private int anInt490 = 614;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	private int[] anIntArray105 = new int[5];

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "[I")
	private int[] anIntArray106 = new int[5];

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
	private int[] anIntArray107 = new int[5];

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	private int anInt492 = 100;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public int anInt493 = 500;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I")
	public int[] method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			Static8.anIntArray108[local3] = 0;
		}
		if (arg1 < 10) {
			return Static8.anIntArray108;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass3_1.method55(7);
		this.aClass3_2.method55(7);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass3_3 != null) {
			this.aClass3_3.method55(7);
			this.aClass3_4.method55(7);
			local36 = (int) ((double) (this.aClass3_3.anInt190 - this.aClass3_3.anInt189) * 32.768D / local26);
			local38 = (int) ((double) this.aClass3_3.anInt189 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass3_5 != null) {
			this.aClass3_5.method55(7);
			this.aClass3_6.method55(7);
			local77 = (int) ((double) (this.aClass3_5.anInt190 - this.aClass3_5.anInt189) * 32.768D / local26);
			local79 = (int) ((double) this.aClass3_5.anInt189 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray105[local118] != 0) {
				Static8.anIntArray111[local118] = 0;
				Static8.anIntArray112[local118] = (int) ((double) this.anIntArray107[local118] * local26);
				Static8.anIntArray113[local118] = (this.anIntArray105[local118] << 14) / 100;
				Static8.anIntArray114[local118] = (int) ((double) (this.aClass3_1.anInt190 - this.aClass3_1.anInt189) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray106[local118]) / local26);
				Static8.anIntArray115[local118] = (int) ((double) this.aClass3_1.anInt189 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass3_1.method56(arg0, -71);
			local207 = this.aClass3_2.method56(arg0, -71);
			@Pc(216) int local216;
			if (this.aClass3_3 != null) {
				local216 = this.aClass3_3.method56(arg0, -71);
				local222 = this.aClass3_4.method56(arg0, -71);
				local201 += this.method242(this.aClass3_3.anInt191, (byte) 18, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass3_5 != null) {
				local216 = this.aClass3_5.method56(arg0, -71);
				local222 = this.aClass3_6.method56(arg0, -71);
				local207 = local207 * ((this.method242(this.aClass3_5.anInt191, (byte) 18, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray105[local216] != 0) {
					local222 = local193 + Static8.anIntArray112[local216];
					if (local222 < arg0) {
						Static8.anIntArray108[local222] += this.method242(this.aClass3_1.anInt191, (byte) 18, local207 * Static8.anIntArray113[local216] >> 15, Static8.anIntArray111[local216]);
						Static8.anIntArray111[local216] += (local201 * Static8.anIntArray114[local216] >> 16) + Static8.anIntArray115[local216];
					}
				}
			}
		}
		if (this.aClass3_7 != null) {
			this.aClass3_7.method55(7);
			this.aClass3_8.method55(7);
			local201 = 0;
			@Pc(367) boolean local367 = false;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				@Pc(379) int local379 = this.aClass3_7.method56(arg0, -71);
				@Pc(385) int local385 = this.aClass3_8.method56(arg0, -71);
				if (local369) {
					local207 = this.aClass3_7.anInt189 + ((this.aClass3_7.anInt190 - this.aClass3_7.anInt189) * local379 >> 8);
				} else {
					local207 = this.aClass3_7.anInt189 + ((this.aClass3_7.anInt190 - this.aClass3_7.anInt189) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					Static8.anIntArray108[local222] = 0;
				}
			}
		}
		if (this.anInt491 > 0 && this.anInt492 > 0) {
			local201 = (int) ((double) this.anInt491 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				Static8.anIntArray108[local207] += Static8.anIntArray108[local207 - local201] * this.anInt492 / 100;
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (Static8.anIntArray108[local201] < -32768) {
				Static8.anIntArray108[local201] = -32768;
			}
			if (Static8.anIntArray108[local201] > 32767) {
				Static8.anIntArray108[local201] = 32767;
			}
		}
		return Static8.anIntArray108;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBII)I")
	private int method242(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != 18) {
				this.anInt490 = -327;
			}
			if (arg0 == 1) {
				return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg0 == 2) {
				return Static8.anIntArray110[arg3 & 0x7FFF] * arg2 >> 14;
			} else if (arg0 == 3) {
				return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg0 == 4) {
				return Static8.anIntArray109[arg3 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("93312, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method243(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.aClass3_1 = new Class3();
			this.aClass3_1.method54(9, arg1);
			this.aClass3_2 = new Class3();
			this.aClass3_2.method54(9, arg1);
			@Pc(24) int local24 = arg1.get1();
			if (local24 != 0) {
				arg1.anInt777--;
				this.aClass3_3 = new Class3();
				this.aClass3_3.method54(9, arg1);
				this.aClass3_4 = new Class3();
				this.aClass3_4.method54(9, arg1);
			}
			local24 = arg1.get1();
			if (local24 != 0) {
				arg1.anInt777--;
				this.aClass3_5 = new Class3();
				this.aClass3_5.method54(9, arg1);
				this.aClass3_6 = new Class3();
				this.aClass3_6.method54(9, arg1);
			}
			local24 = arg1.get1();
			if (local24 != 0) {
				arg1.anInt777--;
				this.aClass3_7 = new Class3();
				this.aClass3_7.method54(9, arg1);
				this.aClass3_8 = new Class3();
				this.aClass3_8.method54(9, arg1);
			}
			for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
				@Pc(127) int local127 = arg1.getSmart();
				if (local127 == 0) {
					break;
				}
				this.anIntArray105[local116] = local127;
				this.anIntArray106[local116] = arg1.method511();
				this.anIntArray107[local116] = arg1.getSmart();
			}
			this.anInt491 = arg1.getSmart();
			this.anInt492 = arg1.getSmart();
			this.anInt493 = arg1.get2();
			if (arg0 != 9) {
				this.anInt489 = -185;
			}
			this.anInt494 = arg1.get2();
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("19733, " + arg0 + ", " + arg1 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}
}
