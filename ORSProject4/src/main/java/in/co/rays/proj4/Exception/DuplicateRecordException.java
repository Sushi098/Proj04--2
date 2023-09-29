package in.co.rays.proj4.Exception;
/**
 * DuplicateRecordException thrown when a duplicate record occurred
 *
 * @author Kim Taehyung V
 *
 */
public class DuplicateRecordException extends Exception {
	/**
     *            : Error message
     */
	public DuplicateRecordException(String msg) {
        super(msg);
    }
}
