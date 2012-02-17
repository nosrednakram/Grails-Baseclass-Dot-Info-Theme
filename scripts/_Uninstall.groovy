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
//
// Layouts
//
ant.delete(file:  "${basedir}/grails-app/views/layouts/baseclass.gsp")
//
// Theme Page
//
ant.delete(file:  "${basedir}/grails-app/views/theme.gsp")
// 
// URL Mapping for Theme Example/Docs
//
ant.delete(file:  "${basedir}/grails-app/conf/ThemeUrlMappings.groovy")
//
// CSS
//
ant.delete(file:  "${basedir}/web-app/css/baseclass/1200.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/1200.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/1560.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/1560.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/1920.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/1920.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/2520.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/2520.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/720.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/720.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/960.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/960.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/color.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/errors.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/main.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/main.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/mobile.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/mobile.min.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/reset.css")
ant.delete(file:  "${basedir}/web-app/css/baseclass/typography.css")
ant.rmdir(dir: "${basedir}/web-app/css/baseclass/")
