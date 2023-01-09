import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static36 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt997 = 4339;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "B")
	private static byte aByte55 = -65;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "B")
	private static byte aByte56 = 6;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "B")
	private static byte aByte57 = -58;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "I")
	private static int anInt998 = -35226;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method679(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
			@Pc(11) char local11 = arg0.charAt(local5);
			local3 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local3 += local11 + 1 - 65;
			} else if (local11 >= 'a' && local11 <= 'z') {
				local3 += local11 + 1 - 97;
			} else if (local11 >= '0' && local11 <= '9') {
				local3 += local11 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method680(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				if (!arg1) {
					throw new NullPointerException();
				}
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray4[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("82603, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method681(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toUpperCase();
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
			@Pc(10) long local10 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local10 = local10 * 61L + (long) local2.charAt(local12) - 32L;
				local10 = local10 + (local10 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local10;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("43421, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method682(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != -43) {
				anInt997 = 391;
			}
			return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("4682, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			} else if (arg1.length() > 0) {
				@Pc(11) char[] local11 = arg1.toCharArray();
				for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
					if (local11[local13] == '_') {
						local11[local13] = ' ';
						if (local13 + 1 < local11.length && local11[local13 + 1] >= 'a' && local11[local13 + 1] <= 'z') {
							local11[local13 + 1] = (char) (local11[local13 + 1] + 'A' - 97);
						}
					}
				}
				if (local11[0] >= 'a' && local11[0] <= 'z') {
					local11[0] = (char) (local11[0] + 'A' - 97);
				}
				return new String(local11);
			} else {
				return arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("29187, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method684(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			if (arg0 != 39922) {
				throw new NullPointerException();
			}
			@Pc(15) int local15 = local5.length;
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
				@Pc(25) char local25 = local5[local19];
				if (local17 && local25 >= 'a' && local25 <= 'z') {
					local5[local19] = (char) (local5[local19] - 32);
					local17 = false;
				}
				if (local25 == '.' || local25 == '!') {
					local17 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("56421, " + arg0 + ", " + arg1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method685(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			if (arg0 != aByte55) {
				throw new NullPointerException();
			}
			for (@Pc(12) int local12 = 0; local12 < arg1.length(); local12++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("27858, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
