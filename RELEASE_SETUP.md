If you haven't released this package before, there are a few things you'll need to do

## Create a GPG key
`brew install gpg2`

Use [this guide](http://central.sonatype.org/pages/working-with-pgp-signatures.html) for generating a key.

## Publish your public key to several key servers

Get your key id `gpg2 --list-keys` (looks something like `453D1C92`)

- `gpg2 --keyserver hkp://pool.sks-keyservers.net --send-keys KEY_ID`
- `gpg --keyserver keyserver.ubuntu.com --send-keys KEY_ID`
- `gpg --keyserver pgp.mit.edu --send-keys KEY_ID`

Then verify that your key is on one of those servers by looking on those servers. Search by your name. If nothing comes up, the key isn't available yet and you can't release.

- http://pgp.mit.edu/
- http://keyserver.ubuntu.com/
- https://sks-keyservers.net/i/

## Sign up for Sonatype jira account at https://issues.sonatype.org
## Put those Sonatype credentials in ~/.m2/settings.xml

it will look like
```
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>divanov-oss.sonatype.org-account</username>
      <password>divanov-oss.sonatype.org-password</password>
    </server>
  </servers>
</settings>
```

## Ask for access

Get someone that already has access to open a ticket requesting access for you ([example](https://issues.sonatype.org/browse/OSSRH-21148?jql=text%20~%20%22docraptor%22)). It's a manual process so you'll have to wait.


