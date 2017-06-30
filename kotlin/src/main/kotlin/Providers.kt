import java.security.Provider
import java.security.Security

/**
 * Created by diogobittencourt on 29/06/17.
 */

fun getProviders(): List<Provider> {
    val providers = Security.getProviders()
    val listOfProviders: List<Provider> = providers.asList()
    return listOfProviders
}
