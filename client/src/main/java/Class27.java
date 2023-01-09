import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public int anInt810 = -1;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt811 = 5;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt813 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt814 = 99;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt816 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
	public int method517(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != -103) {
				this.aBoolean206 = !this.aBoolean206;
			}
			@Pc(15) int local15 = this.anIntArray229[arg1];
			if (local15 == 0) {
				@Pc(24) Class14 local24 = Static13.method327(0, this.anIntArray227[arg1]);
				if (local24 != null) {
					local15 = this.anIntArray229[arg1] = local24.anInt593;
				}
			}
			if (local15 == 0) {
				local15 = 1;
			}
			return local15;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("3095, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method518(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				this.aBoolean206 = !this.aBoolean206;
			}
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg1.get1();
					if (local18 == 0) {
						if (this.anInt809 == 0) {
							this.anInt809 = 1;
							this.anIntArray227 = new int[1];
							this.anIntArray227[0] = -1;
							this.anIntArray228 = new int[1];
							this.anIntArray228[0] = -1;
							this.anIntArray229 = new int[1];
							this.anIntArray229[0] = -1;
						}
						if (this.anInt815 == -1) {
							if (this.anIntArray230 == null) {
								this.anInt815 = 0;
							} else {
								this.anInt815 = 2;
							}
						}
						if (this.anInt816 == -1) {
							if (this.anIntArray230 != null) {
								this.anInt816 = 2;
								return;
							}
							this.anInt816 = 0;
							return;
						}
						return;
					}
					@Pc(45) int local45;
					if (local18 == 1) {
						this.anInt809 = arg1.get1();
						this.anIntArray227 = new int[this.anInt809];
						this.anIntArray228 = new int[this.anInt809];
						this.anIntArray229 = new int[this.anInt809];
						for (local45 = 0; local45 < this.anInt809; local45++) {
							this.anIntArray227[local45] = arg1.get2();
							this.anIntArray228[local45] = arg1.get2();
							if (this.anIntArray228[local45] == 65535) {
								this.anIntArray228[local45] = -1;
							}
							this.anIntArray229[local45] = arg1.get2();
						}
					} else if (local18 == 2) {
						this.anInt810 = arg1.get2();
					} else if (local18 == 3) {
						local45 = arg1.get1();
						this.anIntArray230 = new int[local45 + 1];
						for (@Pc(106) int local106 = 0; local106 < local45; local106++) {
							this.anIntArray230[local106] = arg1.get1();
						}
						this.anIntArray230[local45] = 9999999;
					} else if (local18 == 4) {
						this.aBoolean207 = true;
					} else if (local18 == 5) {
						this.anInt811 = arg1.get1();
					} else if (local18 == 6) {
						this.anInt812 = arg1.get2();
					} else if (local18 == 7) {
						this.anInt813 = arg1.get2();
					} else if (local18 == 8) {
						this.anInt814 = arg1.get1();
					} else if (local18 == 9) {
						this.anInt815 = arg1.get1();
					} else if (local18 == 10) {
						this.anInt816 = arg1.get1();
					} else if (local18 == 11) {
						this.anInt817 = arg1.get1();
					} else {
						System.out.println("Error unrecognised seq config code: " + local18);
					}
				}
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("86950, " + arg0 + ", " + arg1 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}
}
