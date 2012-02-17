//
// This script is executed by Grails after plugin was installed to project.
// This script is a Gant script so you can use all special variables provided
// by Gant (such as 'baseDir' which points on project base dir). You can
// use 'ant' to access a global instance of antBuilder
//
// Install view scaffolding templates
//
ant.mkdir(dir: "${basedir}/src/templates/scaffolding/")
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/create.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/edit.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/list.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/src/templates/scaffolding/show.gsp",
         todir: "${basedir}/src/templates/scaffolding",
         overwrite: true)
//
// Common Blocks
//
ant.mkdir(dir: "${basedir}/grails-app/views/common/")
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_footer.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: false)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_mainnav.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: false)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_search.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: false)
ant.copy(file:  "${pluginBasedir}/grails-app/views/common/_useroptions.gsp",
         todir: "${basedir}/grails-app/views/common",
         overwrite: false)
//
// Layouts
//
ant.copy(file:  "${pluginBasedir}/grails-app/views/layouts/baseclass.gsp",
         todir: "${basedir}/grails-app/views/layouts",
         overwrite: true)
//
// Theme Page
//
ant.copy(file:  "${pluginBasedir}/grails-app/views/theme.gsp",
         todir: "${basedir}/grails-app/views",
         overwrite: true)
// 
// URL Mapping for Theme Example/Docs
//
ant.copy(file:  "${pluginBasedir}/grails-app/conf/ThemeUrlMappings.groovy",
         todir: "${basedir}/grails-app/conf",
         overwrite: true)
//
// CSS
//
ant.mkdir(dir: "${basedir}/web-app/css/baseclass/")
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1200.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1200.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1560.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1560.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1920.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/1920.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/2520.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/2520.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/720.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/720.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/960.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/960.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/color.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/errors.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/main.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/main.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/mobile.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/mobile.min.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/reset.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
ant.copy(file:  "${pluginBasedir}/web-app/css/baseclass/typography.css",
         todir: "${basedir}/web-app/css/baseclass",
         overwrite: true)
