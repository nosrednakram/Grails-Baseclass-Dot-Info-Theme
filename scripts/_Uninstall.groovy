//
// This script is executed by Grails when the plugin is uninstalled from project.
// Use this script if you intend to do any additional clean-up on uninstall, but
// beware of messing up SVN directories!
//
//
// This script is executed by Grails after plugin was installed to project.
// This script is a Gant script so you can use all special variables provided
// by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of antBuilder
//
// Install view scaffolding templates
//
ant.delete(file:  "${basedir}/src/templates/scaffolding/create.gsp")
ant.delete(file:  "${basedir}/src/templates/scaffolding/edit.gsp")
ant.delete(file:  "${basedir}/src/templates/scaffolding/list.gsp")
ant.delete(file:  "${basedir}/src/templates/scaffolding/show.gsp")
ant.delete(dir:   "${basedir}/src/templates/scaffolding")
//
// Common Blocks
//
ant.delete(file:  "${basedir}/grails-app/views/common/_footer.gsp")
ant.delete(file:  "${basedir}/grails-app/views/common/_search.gsp")
ant.delete(file:  "${basedir}/grails-app/views/common/_useroptions.gsp")
ant.delete(dir:   "${basedir}/grails-app/views/common")
//
// Layouts
//
ant.delete(file:  "${basedir}/grails-app/views/layouts/root.gsp")
//
// Theme Page
//
ant.delete(file:  "${basedir}/grails-app/views/theme.gsp")
// 
// URL Mapping for Theme Example/Docs
//
ant.delete(file:  "${basedir}/grails-app/conf/ThemeUrlMappings.groovy")

