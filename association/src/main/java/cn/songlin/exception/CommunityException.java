package cn.songlin.exception;

public class CommunityException extends BizException {

	private static final long serialVersionUID = 3252856823627098049L;

	public static final BizException NICK_EXIST = new BizException(10010001, "该昵称已存在");
}
