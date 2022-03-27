package fun.bitbit.autowiring;

/**
 * Description:
 * Date: 2022/3/27 13:35
 */
public class IgnoreDepTypeServiceImpl implements IgnoreDepTypeService {
	@Override
	public void hello(String s) {
		System.out.println(s);
	}
}
