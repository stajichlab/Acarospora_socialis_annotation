Submit-block ::= {
  contact {
    contact {
      name name {
        last "Stajich",
        first "Jason",
        middle "",
        initials "",
        suffix "",
        title ""
      },
      affil std {
        affil "University of California, Riverside",
        div "Microbiology and Plant Pathology",
        city "Riverside",
        sub "CA",
        country "USA",
        street "900 University Ave",
        email "jason.stajich@ucr.edu",
        phone "951-827-2363",
        postal-code "92521"
      }
    }
  },
  cit {
    authors {
      names std {
        {
          name name {
            last "Adams",
            first "Julia",
            middle "",
            initials "N.",
            suffix "",
            title ""
          }
        },
        {
          name name {
            last "Stajich",
            first "Jason",
            middle "",
            initials "E.",
            suffix "",
            title ""
          }
        }
      },
      affil std {
        affil "University of California, Riverside",
        div "Microbiology and Plant Pathology",
        city "Riverside",
        sub "CA",
        country "USA",
        street "900 University Ave",
        postal-code "92521"
      }
    }
  },
  subtype new
}
Seqdesc ::= pub {
  pub {
    gen {
      cit "unpublished",
      authors {
        names std {
          {
            name name {
              last "Adams",
              first "Julia",
              middle "",
              initials "N.",
              suffix "",
              title ""
            }
          },
          {
            name name {
              last "Stajich",
              first "Jason",
              middle "",
              initials "E.",
              suffix "",
              title ""
            }
          }
        }
      },
      title "Genome annotation of the bright cobblestone lichen, Acarospora
 socialis"
    }
  }
}
Seqdesc ::= user {
  type str "DBLink",
  data {
    {
      label str "BioProject",
      num 1,
      data strs {
        "PRJNA851476"
      }
    },
    {
      label str "BioSample",
      num 1,
      data strs {
        "SAMN29043977"
      }
    }
  }
}
Seqdesc ::= user {
  type str "Submission",
  data {
    {
      label str "AdditionalComment",
      data str "ALT EMAIL:jason.stajich@ucr.edu"
    }
  }
}
Seqdesc ::= user {
  type str "Submission",
  data {
    {
      label str "AdditionalComment",
      data str "Submission Title:None"
    }
  }
}
