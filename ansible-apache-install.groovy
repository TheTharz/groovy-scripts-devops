import org.codehaus.groovy.runtime.InvokerHelper
import org.codehaus.groovy.runtime.MethodClosure
import org.codehaus.groovy.runtime.MethodClosure.Invoker

def playbookContent = """
- hosts: all
  tasks:
    - name: Install Apache
      become: yes
      package:
        name: apache2
        state: present
"""
def playbookFile = new File("ansible_playbook.yaml")
playbookFile.write(playbookContent)

String ansibleCommand = "ansible-playbook ${playbookFile.absolutePath}"

def result = ansibleCommand.execute()

println "Ansible Apache Installation Result:\n${result.text}"

playbookFile.delete()

// has to run and check this one just for sake of writting