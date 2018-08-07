# quotefreak

## Start

```bash
git clone git@github.com:your-user-name/quotefreak.git
cd quotefreak
psql -c "create database quotefreak_development"
lein migrate
```

## Dev

```bash
lein repl
```

```clojure
; in the repl
(start)
```

```bash
http :1337 # hello, world!
```

## Prod (heroku)

```bash
heroku create quotefreak
git push heroku master
heroku addons:create heroku-postgresql
heroku config:add SECRET=$(openssl rand -base64 8 |md5 |head -c16)

heroku run lein migrate
# good to go!
```
