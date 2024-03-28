// Import necessary classes from the Ansible Java API
import org.codehaus.groovy.runtime.InvokerHelper
import org.codehaus.groovy.runtime.MethodClosure
import org.codehaus.groovy.runtime.MethodClosure.Invoker

// Define the Ansible command to ping a host
String ansibleCommand = "ansible all -m ping"

// Execute the Ansible command using Groovy's execute() method
def result = ansibleCommand.execute()

// Print the output of the command
println "Ansible Ping Result:\n${result.text}"
